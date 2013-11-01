                                            Product Management System
                                             Author : Sahan Kanuwana
                                             =======================
This is a simple java application for managing products in a store. Basically it provides save, get, update and remove functionalities (CRUD) related to adding, retriving, updating and removing of products from/to stores located in different locations. I started doing this application to gain knowledge on below technologies. This is just a start. I am going to add more advanced features and functionalities moving forward.

1. Java RESTful web services/Java Jersey Framework 1.7 /JSON
2. Hibernate 3
3. Srping 3
4. Git/GitHub versioning
5. Log4J
6. JUnit unit testing - test driven development (TDD)

How to use the application
==========================
- Download the ProductManagementSystem https://github.com/kanuwana/ProductManagementSystem and ProductManagementSystem-Client https://github.com/kanuwana/ProductManagementSystem-Client applications.
- Add them to your favirite IDE (I use eclipse)
- Set class paths, and resolve any dependancy to library files/jar files. (All the jar files required are bundled into /libs directory No need to download any other jar files. You can just set them into your java build path.
- Install a application server or Tomcat in your IDE. I use WebLogic 12c and Tomcat 7 for ProductManagementSystem and ProductManagementSystem-Client respectively for better hands on experience.
- Run the ProductManagementSystem project and keep it.
- Run the ProductManagementSystem-Client and jsut use it.
- I have gained and covered below development knowledge/handson experience through this.

Java RESTful web services
=========================
- Specific/Strict use of GET,POST,PUT and DELETE
- RESTful - Jersey Annotations
- JSON data transfer
- Annotations
- Preventing cross-site scripting (ESAPI 2.1)
- Preventing SQL injection

Eclipse Kepler, Oracle Web Logic 12c, Oracle Database 12, MYSQL 5
=================================================================
- Application development and deployment to the server
- Data source definitions, SQL

Hibernate 3
===========
- Basic and advanced annotations (Java persistence annotations and hibernate annotations) {Entity, Table, Column, Id, GeneratedValue, Transient, Embedded, Embeddable, GenericGenerator, ElementCollection, CollectionId, OneToOne, OneToMany, ManyToMany, ManyToOne, AttributeOverrides, AttributeOverride, etc}
- Hibernate configurations (caching, hbm2ddl and more configurations in hibernate.cfg.xml hibernate config file)
- Mapping and relationships between entities 
- Persisting collections, Embedding objects, Casacading objects
- Primary Key, Surrogate Key, Foreign key relationships
- Attribute overriding
- Proxy object - lazy/Eager initialization
- Persistent, Transient, Detached objects and state changes
- Named queries, HQL
- Parameter binding, SQL injection, Caching, Query Cache
- Pagination, Projections, Restrictions

Spring 3
========
- Dependancy Injection
- AOP for Logging Aspect
- Hibernate, Data source, Transaction manager configuration
- Using property files with placeholders
- AOP – AspectJ for logging aspect
- Using Bean Factory
- Bean scope
- Bean injection, autowiring
- Bean lifecycle call back methods (InitilizingBean-afterPropertySet, DisposableBean-destroy, and defining them globally)
- Beanpostprocessor, BeanFactoryPostProcessor
- Reading property files and assing property valies in xml file
- Code to interface
- Inner beans, idref, aliases
- Place holders
- ApplicationContextAware, BeanAware interfaces
- Bean definition inheritance, abstract beans, merging collections with inheritance
- Unhooking the application context for desktop apps (AbstractApplicationContext – registerShutdownHook)
- Annotations [Required, Autowired, Qualife]
- JSR annotations [Resource, PostConstruct, PreDestroy]
- Steriotypes [Component, Controller, Service, Repository
- MessageSource (resource bundle message source) with properties files with placeholders
- Event listeners (applicationListerner, custom event listeners


Git&GitHub
==========
- Experience on Git Bash, Git GUI and GitHub (online) from the begining

JUnit 4
=======
- Test Driven Development
- Test Runner, Test Suite, Test Case, Test

Logging
=======
- Logging using Log4J

Video Tutorials Reffered
========================
These are the nice video tutorials I went through. These are really helpful and simple. Thanks JavaBrains and 308Tube!

- Hibernate http://www.youtube.com/watch?v=Yv2xctJxE-w&list=PL4AFF701184976B25

- Spring http://www.youtube.com/watch?v=GB8k2-Egfv0&list=PLC97BDEFDCDD169D7

- RESTful Web http://www.youtube.com/watch?v=gKBiIWY7FYw

- Git & GitHub http://www.youtube.com/watch?v=mYjZtU1-u9Y

Thank You All - Sahan Kanuwana
