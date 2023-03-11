# The-Web-Server-Problem

Problem
Given you have T websites on a server. You have to serve data for each website from your server in such a way that no websites remain unresponsive for more than a minute.


Each of your websites contains;

Home page

About Us page

Contact Us page



Each page listed has the following content with a maximum size that needs to be served:

Text content piece - 5 MB each

Images - Total of 20 MB. Each image is of equal size totalling 20 MB.

Forms - Total of 5 MB. Each form is of equal size.



Take into account that for each website to be considered operational, we consider only loading the homepage. And the priority is that we need to load the content first, then the images and finally the forms.


A noted improvement is that the more images on the homepage perform better to keep the page operational, so the server favours the homepage with less content and more images to be served first.


Write an algorithm to arrange the T input in a way that should be served first to last, given that the maximum server speed is 2 Mbps.

Input
The first line of input T  is the number of test cases 

Each Test case contains sizes of;

Text content  =  A

Images = B

Forms = C

Output
Arrange the T website as shown in the sample output.

Limits
Small Set

1 < A < 15

1 < B < 23

-1 < C < 10


Large Set

1 < A <= 100

1 < B <= 120

-1 < C <= 75

Sample
Sample Input


4

3,4,2

4,2,0

5,5,1

3,6,2

Sample Output


3,6,2

3,4,2

4,2,0

5,5,1
