# CONTACTS TEST APP


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

App allows simple crud operation on 'contact' object

## How to run

- Run application with SPRING_PROFILES_ACTIVE = dev 
- http://localhost/contact is the end point for object
- Any contact can be searched using following endpoint http://localhost/contact/findContactByPostalCode/{postalCode}
- Or we can retrieve object using GET on endpoint http://localhost/contact/{id}
- You can post below sample object
### Sample Object

```sh
{
    "fullName":"Ahsan Shahid",
    "dob":"1990-10-10",
    "address":
    {
        "city":"Lahore",
        "postalCode":"55555"
    }
}
