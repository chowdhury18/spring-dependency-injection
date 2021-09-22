# spring-dependency-injection
- Spring dependency injections: 
    - Property based injection 
    - Setter based injection
        - Does not ensure dependency injection
        - Security issues: override certain dependencies
        - Solves circular dependencies
    - Constructor based injection
        - Ensure by not allowing to construct an object until the dependencies are ready
    
## Spring context
- Spring context is also known as application context
- Responsible for 
    - instantiating
    - configuring 
    - assembling beans 
      by reading configuration metadata from XML, Java annotations, and/or Java code in the configuration files.