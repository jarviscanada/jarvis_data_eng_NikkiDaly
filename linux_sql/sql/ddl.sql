--switch to `host_agent`
\c host_agent

--create 'host_info' table if it doesn't exist
CREATE TABLE IF NOT EXISTS PUBLIC.host_info
(
    id                  SERIAL NOT NULL PRIMARY KEY,
    hostname            VARCHAR NOT NULL UNIQUE,
    cpu_number          INT NOT NULL,
    cpu_architecture    VARCHAR NOT NULL,
    cpu_model           VARCHAR NOT NULL,
    cpu_mhz             FLOAT NOT NULL,
    L2_cache            INT NOT NULL,
    total_mem           INT NOT NULL,
    timestamp           TIMESTAMP NOT NULL
);

--create 'host_usage' table if it doesn't exist
CREATE TABLE IF NOT EXISTS PUBLIC.host_usage
(
    "timestamp"         TIMESTAMP NOT NULL,
    host_id             SERIAL NOT NULL,
    memory_free         INT NOT NULL,
    cpu_idle            INT NOT NULL,
    cpu_kernel          INT NOT NULL,
    disk_io             INT NOT NULL,
    disk_available      INT NOT NULL
);


