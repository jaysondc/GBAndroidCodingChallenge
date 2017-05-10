# GBAndroidCodingChallenge

### Description
Create a simple android app that requests 
data from a given URL, parses it, and displays it to a RecyclerView.

### Process
I started by using the Android Studio template for a blank activity, then adding
a single fragment using MVP architecture. I then added the following libraries:

 - *Cardview* - I'm a fan of Material Design and think CardViews are a great fit for RecyclerViews.
 - *RecyclerView* - The task prompt required the use of RecyclerView over ListView. RecyclerView is a little more complicated to work with but the flexibility it provides is woorth the effort.
 - *Glide* - This library handles Async loading, caching, and displaying of images with basically a single line of code. It's pretty great.
 - *Volley* - Volley greatly simplifies creating managing network requests in Android. It's only meant for short tasks, so it's perfect for us.

The first milestone was obtaining and printing the server response. I chose to create a Singleton version of the RequestQueue so we can access it through the presenter, not the fragment. Once the request was received, I printed it to the debug log.

The next milestone was parsing the JSON string into Java objects. I created a simple Guide object to hold the data strings, parsed each Guide, and stored them in an ArrayList to be used by the RecyclerViewAdapter.

Unfortunately ran past the allotted hour setting up the RecyclerView and ListItems, but I still plan to complete the project. 

### Techincal Choices/Tradeoffs
 - Spent a lot of time setting up boilerplate code for MVP. It makes apps more testable but for a project like this it isn't necessary. I implemented it demonstrate knowledge, but if I hadn't I might have been able to complete the whole task in an hour.
 - Spent time creating the RecyclerView UI before parsing the JSON, thinking it would save me time to have the layouts ready once I had my objects. It didn't.
 - The Venue City and State data is missing form the JSON response so the only placeholder data is in the UI.
Overall I think this is a very good challenge that demonstrates coding ability and Android development knowledge.
