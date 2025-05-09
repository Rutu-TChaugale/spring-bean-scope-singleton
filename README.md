
# Spring Bean Scope Demo: Singleton & Prototype

This repository demonstrates how Spring Framework handles different **bean scopes**, specifically **Singleton** and **Prototype**. The project includes examples of both scopes using different types of containers (`BeanFactory` and `ApplicationContext`) and shows how bean instances are managed using XML-based configuration.

- **Singleton Scope**: Only one shared instance per Spring container.
- **Prototype Scope**: A new instance is created each time the bean is requested.

---

## 📁 Project Structure

```

Root Directory/
│
├── Second\_Spring\_Scope\_Singleton/                    # Combined Singleton & Prototype Scope Demo
│   ├── src/
│   │   ├── com.sit.client/
│   │   │   ├── TestSingletonUsingCoreContainer.java       # Singleton demo
│   │   │   └── TestPrototypeUsingIOCContainer.java        # Prototype demo (via ApplicationContext)
│   │   ├── com.sit.model/
│   │   │   └── Student.java                               # Common bean class
│   │   └── beans.xml                                      # Bean definitions with both scopes
│   └── Spring\_Jar/                                        # Spring libraries
│
├── Third\_Spring\_Scope\_Prototype/                     # Dedicated Prototype Scope Demo
│   ├── src/
│   │   ├── com.sit.client/
│   │   │   └── TestPrototypeUsingIOCContainer.java        # Prototype demo only
│   │   ├── com.sit.model/
│   │   │   └── Student.java                               # Same bean class
│   │   └── beans.xml                                      # Prototype bean definition
│   └── Spring\_Jar/                                        # Spring libraries

```

---

## 🔍 Files Overview

### Common

- **Student.java** – POJO class representing the bean to demonstrate instantiation behavior.
- **beans.xml** – Spring configuration file with `singleton` and `prototype` bean definitions.

### Project: `Second_Spring_Scope_Singleton/`

- **TestSingletonUsingCoreContainer.java** – Uses `BeanFactory` to demonstrate Singleton behavior.
- **TestPrototypeUsingIOCContainer.java** – Uses `ApplicationContext` to demonstrate Prototype behavior within the same project.

### Project: `Third_Spring_Scope_Prototype/`

- **TestPrototypeUsingIOCContainer.java** – Isolated demo to test prototype scope separately.

---

## 🧪 How to Run

1. Ensure Java SE 21 is installed.
2. Open either project (`Second_Spring_Scope_Singleton` or `Third_Spring_Scope_Prototype`) in your IDE.
3. Add Spring JARs from the `Spring_Jar/` folder to your classpath.
4. Run the client classes to observe the scope behavior:
   - `TestSingletonUsingCoreContainer.java`
   - `TestPrototypeUsingIOCContainer.java`

---

## 💡 What You'll Learn

- Difference between Singleton and Prototype scopes
- When to use each bean scope
- Usage of `BeanFactory` vs `ApplicationContext`
- Spring XML-based configuration and bean management

---

## 🖼️ Sample Output

**Singleton Example:**
```

Student object hashCode: 123456
Student object hashCode: 123456  ← Same object reused

```

**Prototype Example:**
```

Student object hashCode: 123456
Student object hashCode: 789012  ← Different objects created

```

---

## 📦 Dependencies

- Java SE 21
- Spring Core JARs (included manually in `Spring_Jar/`)
