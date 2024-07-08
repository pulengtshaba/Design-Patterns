# Mr D app

Say you create an app like Mr D, where you collect the menus and all the relevant data of several restaurants. The app dowmloads the data from multiple sourcees in XML format and the use those to display menu images and recommendations for each user to pick from.

## Improvements

Now you want to upgrade the app by introducing major UI changes that'll drastically improve UX. Say this improvement involves a 3rd party library with fancy components but uses JSON format instead of XML format. Changing the library to work with XML may introduce bugs. Solution may be to create an adapter which would take our XML data and transform it to JSON, making it compatible with the 3rd party.