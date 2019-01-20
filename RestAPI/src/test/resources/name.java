<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite name="Employee REst API Automation Script " parallel="false">

    <parameter name="useCloudEnv" value="false"/>
    <parameter name="cloudEnvName" value="browserstack"/>
    <parameter name="os" value="OS X"/>
    <parameter name="os_version" value="Sierra"/>
    <parameter name="browserName" value="chrome"/>
    <parameter name="browserVersion" value="60.0"/>

    <test name = "Employee Information Services">
        <classes>
            <class name="rest.SingleEmployeeAPI"/>
            <class name="rest.AllEmployeeAPI"/>
        </classes>
    </test>

</suite>