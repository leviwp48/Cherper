# *Cherper2*

**Cherper2** is an android app that allows a user to view his Twitter timeline and post a new tweet. The app utilizes [Twitter REST API](https://dev.twitter.com/rest/public).

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/leviwp48/Cherper/blob/master/Cherper2.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

## App Features

* User can **sign in to Twitter** using OAuth login
* User can **view tweets from their home timeline**
  * User is displayed the username, name, and body for each tweet
  * User is displayed the [relative timestamp](https://gist.github.com/nesquena/f786232f5ef72f6e10a7) for each tweet "8m", "7h"
* User can refresh tweets timeline by pulling down to refresh
* User is using **"Twitter branded" colors and styles**
* User can **compose and post a new tweet**
  * User can click a “Compose” icon in the Action Bar on the top right
  * User can then enter a new tweet and post this to twitter
  * User is taken back to home timeline with **new tweet visible** in timeline
  * Newly created tweet should be manually inserted into the timeline and not rely on a full refresh 
* Use Parcelable instead of Serializable using the popular [Parceler library](http://guides.codepath.com/android/Using-Parceler).
* User can **see a counter with total number of characters left for tweet** on compose tweet page
* User can **pull down to refresh tweets timeline**
* Data is persisted within SQLite

## To Do Features

* User can view more tweets as they scroll with infinite pagination
* User can tap a tweet to display a "detailed" view of that tweet
* User can open the twitter app offline and see last loaded tweets
* Replace all icon drawables and other static image assets with [vector drawables](http://guides.codepath.com/android/Drawables#vector-drawables) where appropriate.
* User can see embedded image media within the tweet detail view
* User sees an **indeterminate progress indicator** when any background or network task is happening
* User can **see embedded image media within a tweet** on list or detail view.
* User can **click a link within a tweet body** on tweet details view. The click will launch the web browser with relevant page opened.
* User can view following / followers list through any profile they view.
* User can **select "reply" from detail view to respond to a tweet**
  * User that wrote the original tweet is **automatically "@" replied in compose**
* User can tap a tweet to **open a detailed tweet view**
  * User can **take favorite (and unfavorite) or reweet** actions on a tweet
* Compose tweet functionality is build using modal overlay
* Replace all icon drawables and other static image assets with [vector drawables](http://guides.codepath.com/android/Drawables#vector-drawables) where appropriate.
* User can **click a link within a tweet body** on tweet details view. The click will launch the web browser with relevant page opened.
* Use the popular ButterKnife annotation library to reduce view boilerplate.
* On the Twitter timeline, leverage the [CoordinatorLayout](http://guides.codepath.com/android/Handling-Scrolls-with-CoordinatorLayout#responding-to-scroll-events) to apply scrolling behavior that [hides / shows the toolbar](http://guides.codepath.com/android/Using-the-App-ToolBar#reacting-to-scroll).
* User can **open the twitter app offline and see last loaded tweets**. Persisted in SQLite tweets are refreshed on every application launch. While "live data" is displayed when app can get it from Twitter API, it is also saved for use in offline mode.

## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2018] [Levi Pole]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
