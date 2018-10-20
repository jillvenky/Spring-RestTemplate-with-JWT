# Spring-RestTemplate-with-JWT


Main service is https://github.com/rkritchat/library-system (library-system)
this api has Spring JPA and Spring Security(JWT token)

Spring-RestTemplate-with-JWT is third party api, it will communicate with UI and library-system

  UI     ->     Spring-RestTemplate-with-JWT     ->      library-system
         <-                                      <-

for example
 - get token key from library-system.
 - set token into header.
 - sent request for check that token is valid and header of RestTemplate is working.
 
