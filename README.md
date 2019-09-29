### Metamug Plugin Example

This is a sample plugin to get started. Metamug API Plugin must be a maven project and 
must contain [Metamug API SDK](https://github.com/metamug/mtg-api) as a dependency.

This example contains
* RequestProcessable
* ResponseProcessable
* ResultProcessable

### Upload Plugin

Download the zip from here and upload it into a running console. http://localhost:7000/console/#/plugin

![Metamug API Plugin Example](https://lh3.googleusercontent.com/-lPZIDA17RqM/XZCydv0wWyI/AAAAAAAAIhA/8-ayZtHdsFMf3zCSGhg0PUCBwgbt8InwwCK8BGAsYHg/s0/2019-09-29.png)

### Invocation
You can declare the execute tag in the resource file to invoke these plugin classes. 
```xml
<Execute classname="com.metamug.plugin.RequestExample" id="someBusinessLogic" />
```

Or they can be declared as a part of SQL tag. To know more about metamug api plugins, read the docs [here](https://metamug.com/docs/plugins).
