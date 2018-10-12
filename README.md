# Commons

## validators

* Toolkit for Enterprise Level `Validations`.
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
