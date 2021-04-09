Feature: Application Login
# Keywords are all highlighted here because of the plugin natural 
	Scenario: Home page default login
	Given User is on netbanking landing page
	When User login into application with "Jin" and "45611"
	Then Home page is populated
	And cards displayed are "true"
	
	Scenario: Home page default login
	Given User is on netbanking landing page
	When User login into application with "John" and "34343"
	Then Home page is populated
	And cards displayed are "false"