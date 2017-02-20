# Spring topics
Spring core concepts are DI and AOP, can also be used in normal java application to achieve loose coupling between different components by implemneting DI.
Advantages :
------------
1. Reducing direct dependencies between different component of the application, usually Spring IOC container is responsible for initializing resources or beans and inject them as dependencies.
2. Reduce the amount of boiler plate code , such as initializing object, open/close resources. JDBC template class helps is removing all the boiler plate code that comes with JDBC programming.
3. Spring framework is divided into several modules, it helps us in keeping our application lightweight. For e.g if we don't need spring transaction management ,we don't need to add that dependency in our project.

Spring Modules :
a) Spring context : for dependency injection
b) Spring AOP :for aspect oriented programming
c) Spring DAO : for database operations using DAO
d) Spring JDBC : for JDBC and DataSource support
e) Spring ORM : for ORM tool support such as Hibernate
f) Spring web module : for creating web applications
g) Spring MVC for creating web -applications using MVC


IOC vs DI:
IOC means giving control to the container to get isntance of object is called Inversion of control, means instead of you are creating object using new operator ,let the container do that for you.
Way of injecting properties to an object is called Dependency Injection.

Spring IOC Container:
--------------------
Ioc is the mechanism to achieve loose-coupling between object dependencies.Spring Ioc container is the program that injects dependencies into an object and make it ready for our use.This container will create the objects, write them together, configure them and manage their complete life cycle from creation till destruction.The container gets its instruction on what object to instantiate , confiure and asemble by reading configuration meteadat provided. Configuration can be provided either by XML, Java annotationaor java code. Types are:
a) FileSystemXmlApplicationContext: loads the definitions of the beans from an XML file. Here you need to provide the full path of the XML bean configuration file to the constructor.
b) ClassPathXmlApplicationContext: loads the definitions of the beans from an XML file. Here you do not need to provide the full path of the XML file but you need to set CLASSPATH properly because this container will look bean configuration XML file in CLASSPATH.
c) WebXmlApplicationContext:loads the XML file with definitions of all beans from within a web application.


Scopes of Spring Bean:
------------------------
a) Singleton : Only one instance of the bean will be created for each container. This is the default scope.
b) prototype :A new instance will be created every time the bean is requested.
c) request : same as prototype but new instance will be created for each HTTP request.
d) session : A new bean will be created for each HTTP session by the container.
e) global session : Used to create global session bean for portlet aplication.


Spring Bean life cycle:
---------------------------
When a bean is instantiated, it may be required to perform some initialization to get it into a usable state. Similarly, when the bean is no longer required and is removed from the container, some cleanup may be required.
To define setup and teardown for a bean, we simply declare the <bean> with init-method and/or destroy-method parameters. The init-method attribute specifies a method that is to be called on the bean immediately upon instantiation. Similarly, destroy-method specifies a method that is called just before a bean is removed from the container.
<bean id="exampleBean"  class="examples.ExampleBean" init-method="init"/>
<bean id="exampleBean"  class="examples.ExampleBean" destroy-method="destroy"/>
