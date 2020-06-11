--Group hosts by CPU number and sort by their memory size
--in descending order(within each cpu_number group)
SELECT
    cpu_number,
    id as host_id,
    total_mem
FROM host_info
ORDER BY cpu_number ASC, total_mem DESC;

--Average used memory in percentage over 5 mins interval for each host.
--(used memory = total memory - free memory).
SELECT
    usage.host_id,
    info.hostname,
    (date_trunc('hour', usage.timestamp) + INTERVAL '5 min' * ROUND(date_part('minute', usage.timestamp)/ 5.0)) as timestamp,
    AVG((info.total_mem - usage.memory_free*1000)/info.total_mem * 100) OVER (
        PARTITION BY usage.host_id
        ORDER BY
            usage.timestamp
    ) AS avg_used_mem_percentage
FROM host_usage usage INNER JOIN host_info info ON info.id=usage.host_id;




