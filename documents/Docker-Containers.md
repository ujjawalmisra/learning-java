#Docker

##Evolution of servers

###Bare metal
The physical server having essential hardware components - CPU, Memory, Disk, Network Card - and devoid of input 
devices like keyboard and output devices like monitor.

###Node
Bare metal with OS running. When we deploy our application they run as a process on the node. A physcial server running
only few processes, i.e. utilizing limited CPU, or using only limited storage, might prove to be a costly investment.
However, its difficult to keep increasing the hardware on a single node when traffic increases. This is because a 
node can practically support only so much hardware. Adding more hardware to the same node to support increased traffic 
is called _Vertical Scaling_.

###Virtualization
In order to reduce the cost, virtualization can be used. Hypervizor helps in converting a bare metal (Type-1 Hypervisor) 
or node (Type-2 Hypervisor) to  multiple virtual machines (VMs). VMs on the same machine are isolated from each other 
but run over the same underlying  hardware. When we deploy our application they run as a process on the node. 
Virtualization allows for better  utilization of the hardware and reduced cost. However, the processes might be slower 
because they have to pass through an extra layer -- the hypervisor.
With a VM image in place, as traffic increases more replicas of the process can be created by launching more VMs from 
the VM image. This is called _Horizontal Scaling_.

###Docker
Docker is a light-weight process that contains a OS kernel and files/resources to run. Docker containers directly run 
on the node as processes. Because of the small size and running directly on the node the docker container might be 
faster than the process running on a VM. Dockers support Horizontal Scaling through Containers.

![Bare-metal to Docker](https://raw.githubusercontent.com/ujjawalmisra/learning-java/main/images/bare-metal-to-docker.png)

## Docker Setup Steps

### Pull the image
Pull the latest (or version) docker image
You can check the available images on: https://hub.docker.com/

```shell script
docker pull postgres:latest
```

### Check the version

```shell script
docker image inspect postgres | grep PG_VERSION | uniq
```

### Run
The run command will create a container and then start it.
Read more about possible options: https://docs.docker.com/engine/reference/commandline/run/

```shell script
docker run --name zs-intern-pgsql -d -e POSTGRES_PASSWORD=root123 -p 2006:5432 postgres:latest
```

In order to stop the container use:
```shell script
docker stop <name>
```

In order to restart the container use:
```shell script
docker start <name>
```

### Postgresql

Connect to postgresql via psql
```shell script
 docker exec -it zs-intern-pgsql psql -U postgres -h <your-non-localhost-ip> -p 2006
```
Create a testable data
```postgresql
CREATE DATABASE zs_intern_test;
-- In the next step, we connect to the database before creating the table
\c zs_intern_test
CREATE TABLE employee (
	id serial PRIMARY KEY,
	name varchar (50) ,
	email varchar(40),
	phone varchar (40) ,
	city varchar(40)
	);

INSERT INTO employee (id, email, name, phone, city) 
  VALUES(1, 'ram@posgresqltest.com', 'Ram', '9848022338', 'Bangalore');
INSERT INTO employee (id, email, name, phone, city) 
  VALUES(2, 'robin@postgresqltest.com', 'Robin', '9848022339', 'Hyderabad');
INSERT INTO employee (id, email, name, phone, city) 
  VALUES(3, 'rahman@postgresqltest.com', 'Rahman', '9848022330', 'Chennai');
```


