mybatis-migrations-oracle-fix
=============================

Fixes Oracle objects compilation issue when running MyBatis Migrations on Windows

* Migrations with PL/SQL blocks don't compile properly on Oracle when running on Windows - it does not happen on Unix-like OS;
* You can have more informations about this issue on ["Issue 53: Can't run migration scripts that have PL/SQL blocks for Oracle" ](https://code.google.com/p/mybatis/issues/detail?id=53);
