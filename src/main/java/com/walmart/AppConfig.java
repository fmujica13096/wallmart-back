//package com.walmart;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@Configuration
//public class AppConfig {
//
//
//
////        public MongoClient mongoClient() {
//////            return MongoClients.create("mongodb://localhost:27017/mongo");
//////        }
//
//
////    public MongoClient mongoClient() {
////          return MongoClients.create("mongodb://mongodb:27020/mongo");
////        }
//
//
//    public MongoClient mongoClient() {
//        return MongoClients.create("mongodb://mongodb:27020/mongo");
//    }
//
//
//
//    public @Bean
//        MongoTemplate mongoTemplate() {
//            return new MongoTemplate(mongoClient(), "libraryDB");
//        }
//    }
//
