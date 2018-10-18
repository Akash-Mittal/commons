# Commons

[![Build Status](https://travis-ci.org/Akash-Mittal/commons.svg?branch=master)](https://travis-ci.org/Akash-Mittal/commons)
[![GitHub issues](https://img.shields.io/github/issues/Akash-Mittal/commons.svg)](https://github.com/Akash-Mittal/commons/issues)
[![GitHub forks](https://img.shields.io/github/forks/Akash-Mittal/commons.svg)](https://github.com/Akash-Mittal/commons/network)
[![GitHub stars](https://img.shields.io/github/stars/Akash-Mittal/commons.svg)](https://github.com/Akash-Mittal/commons/stargazers)
[![GitHub license](https://img.shields.io/github/license/Akash-Mittal/commons.svg)](https://github.com/Akash-Mittal/commons/blob/master/LICENSE)


## validators

*  Toolkit for Enterprise Level `Validations`.
*  Also adds `guava` libraries for Predicates 
* `Fail Safe` behaviour via `Java 8 ` `Predicates` and `BiPredicates`.  

## Entities

* Serves common Entities for all `JPA/Hibernate` projects which need `Auditable Entities`.
* Features `id`, `createdTime` , `lastUpdated`, `createdBy` et al.

### How to add as Dependency.

#### Maven
    
 * Add Repository in `pom.xml` .
    
        <repositories>
          <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
          </repository>
        </repositories>

* Then Add Dependency.  

      <dependency>
          <groupId>com.github.Akash-Mittal</groupId>
              <artifactId>commons</artifactId>
          <version>master-SNAPSHOT</version>
      </dependency>

	  
#### Gradle

 * Add Repository in `build.gradle` .
    
		allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}

* Then Add Dependency.  

		dependencies {
			implementation 'com.github.Akash-Mittal:commons:master-SNAPSHOT'
		}
