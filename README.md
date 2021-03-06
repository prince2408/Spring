# Spring topics
Spring core concepts are DI and AOP, can also be used in normal java application to achieve loose coupling between different components by implemneting DI.
Advantages :
------------
1. Reducing direct dependencies between different component of the application, usually Spring IOC container is responsible for initializing resources or beans and inject them as dependencies.
2. Reduce the amount of boiler plate code , such as initializing object, open/close resources. JDBC template class helps is removing all the boiler plate code that comes with JDBC programming.
3. Spring framework is divided into several modules, it helps us in keeping our application lightweight. For e.g if we don't need spring transaction management ,we don't need to add that dependency in our project.

Spring Containers:
-----------------
contains all the objects and container manages the lifecycle of each object i.e instantiation, destruction, and life cycle of objects
and uses factory pattern for object creation. Bean factory reads the spring XML of beans to find the requirement of what kind of object needs to be created and then transfer the object to the actual class.

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

Spring IOC Container using Application context:
-----------------------------------------------
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

<constructor-arg type="int" value="20"/>
<constructor-arg index="0" value="20"/>
<constructor-arg index="1" value="Equilateral"/>

ApplicationContextAware : An interface which provides the context throughout the spring project.
BeanContextAware : An interface which provides the bean details throughout the spring project.

BeanPostProcessor:
---------------------
Classes which tell spring that there are some processes that needs to happen after the initialization of beans, Spring executes this code after initialization of each and every bean.
Bean PP is a separate class and method of this class run on each and every bean initialization.
Used to extend the functinality of the product.

Miscellaneous:
----------------
DispatcherServlet :  is the front controller in the Spring MVC application and it loads the spring bean configuration file and initialize all the beans that are configured. If annotations are enabled, it also scans the packages and configure any bean annotated with @Component, @Controller, @Repository or @Service annotations.

ContextLoaderListener :  is the listener to start up and shut down Spring’s root WebApplicationContext. It’s important functions are to tie up the lifecycle of ApplicationContext to the lifecycle of the ServletContext and to automate the creation of ApplicationContext. We can use it to define shared beans that can be used across different spring contexts.

Other Important Points:
-------------------------
1) Following design pattern has been used in spring framework:
a) Factory Pattern: Bean Factory classes
b) Prototype Pattern : Bean scope
c) Singleton Pattern : Creating beans with default scope.

Spring-Hibernate integration:
----------------------------------
PersonDao --> interface, PersonDaoImpl, Person POJO--> responsible to create table as well using annotations @Entity, @Table etc.
Main () --> to create the application context.

Spring MVC:
---------------
How would you relate Spring MVC Framework to MVC architecture?

As the name suggests Spring MVC is built on top of Model-View-Controller architecture. DispatcherServlet is the Front Controller in the Spring MVC application that takes care of all the incoming requests and delegate it to different controller handler methods.

Model can be any Java Bean in the Spring Framework, just like any other MVC framework Spring provides automatic binding of form data to java beans. We can set model beans as attributes to be used in the view pages.

View Pages can be JSP, static HTMLs etc. and view resolvers are responsible for finding the correct view page. Once the view page is identified, control is given back to the DispatcherServlet controller. DispatcherServlet is responsible for rendering the view and returning the final response to the client.


View Resolver: 
View Resolver implementations are used to resolve view pages by name. InternalResourceViewResolver is one of the implementation of view resolver interface and we are providing the view pages direcoty and suffix location through the bean properties.So if a controller handler method returns "home".view resolver will use view page located at /WEB-INF/views/home.jsp

<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	<beans:property name="prefix" value="/WEB-INF/views/" />
	<beans:property name="suffix" value=".jsp" />
  
DispatcherServlet handles all the http request and response and is the front controller in the Spring MVC application and it loads the spring bean configuration file and initialize all the beans that are configured. If annotations are enabled, it also scans the packages and configure any bean annotated with @Component, @Controller, @Repository or @Service annotations.

ContextLoaderListener is the listener to start up and shut down Spring’s root WebApplicationContext. It’s important functions are to tie up the lifecycle of ApplicationContext to the lifecycle of the ServletContext and to automate the creation of ApplicationContext. We can use it to define shared beans that can be used across different spring contexts.
  
</beans:bean>

