# Hadoop Project 

Table of contents
* [Introduction](#Introduction)
* [Hadoop Cluster](#Hadoop Cluster)
* [Hive Project](#Hive Project)
* [Improvements](#Improvements)

# Introduction
For this project I have helped the data analytics team to process data using Apache Hadoop and evaluate different tools, specifically MapReduce, 
HDFS, and YARN. Hadoop provides a software framework for distributed storage and processing of big data using the MapReduce programming model. 
It utilizes HDFS (Hadoop Distributed File System) which ensures fault tolerance and high availability. For this project I provisioned a 
Hadoop cluster through Google Cloud Computing. Some sample queries uisng Apache Hive were performed on sample data and recorded in a 
Zeppelin notebook. 

# Hadoop Cluster

![](assets/clusterDiagram.png)

The interface that I used to run the queries was Zeppelin notebook. The Zeppelin service runs on the master node as well and connects to Hive 
using a JDBC driver. The Hive client connects to the server using a JDBC application, for this project I used JDBC Beeline. The Hive Server 
then connects to the Hive Metastore which is a central repository that uses a RDBMS to store all of the Hive metadata. The worker nodes are
communicated to through the YARN Resource Manager which manages everything in the cluster. They contain an Application Manager which 
distributes the query tasks between the two worker nodes. 

# Hive Project
The purpose of this project was the evaluate Hive as a big data tool. Using Zeppelin notebook I was able to compare Hive query performance 
to both Bash script and Spark queries. In addition to this I performed partitioning and columnar file formats to increase the efficiency of 
the queries.  
![](assets/zeppelinNotebook.png)

# Improvements
1. Try using more worker nodes to see how much faster they can complete the query. 
2. More tests and comparisons could be done between the different approaches.
3. I could test with a larger dataset to see the trade offs in performance between the different approaches. 