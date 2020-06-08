# PlaySafePractical

Practical Done for PlaySafe Skills Assessment (Unit Conveter Services)

Apologies to the PlaySafe Team, but the GitHub requirement was only provided to me a little later.

Below is the process I followed to create a Java REST API to do the unit converstion and also what tools I used to actualise the solution.

## Preperation 
I researched to find the formulae's for each of the needed conversions, and added this to a text editor of my choice, in this case Kate. To ensure precision on the actual ouput, 'double' was used for the input and putput.

## Coding
1. Step 1 - I created a Eclipse Project using Spring.io -> Selecting Spring-Web
2. Step 2 - I created an a package to contain the API's
3. Step 3 - I started developing the Restcontroller for each service
4. Step 4 - I iterratively added the functions to each part of the code, and added the nessary Spring-Web annotations.
5. Step 5 - During the development process I made mistakes (which I corrected through rapid prototyping), they are listed under the Mistakes and Fixes category.
6 The URL's which was tested was the

## Service URI's for the project
Please find below the service api's for the conversion service. There are three services each with a paramater variable for the input for the service, and produces a response in the HTTP reponse body containing the answer.

### Miles to Kilometers conversion
* Example URL : http://localhost:8080/api/v1/miles/67

### Pounds to Kilograms conversion
* Example URL : http://localhost:8080/api/v1/pounds/5

### Kelvin to Celcius Conversion
* Example URL : http://localhost:8080/api/v1/kelvin/300

## Testing process used to test the accuracy of code
Google was used to test the accuracy of the values check only, and the code was untouched as the original code calculations was accurate.

## Mistakes and Bug Fixes
There was two critical flaws in my application, which blocked me from completing the entire solution in perfect time.

Bug 1
-----
Bug one, Spring failed to pick-up my @RequestMapping URI mappings specified in my Java classes. 

I did not know about this fix unfortunately, which makes the classes known to Spring if it missed it during its start-up scan of your src directory. I had to force Spring to inlude my classes:
> @ComponentScan(basePackageClasses = {KelvinToCelcuis.class, MilesToKilometers.class,PoundsToKilograms.class})

Bug 2
-----
Forgot the @PathVariable("") brackets 

