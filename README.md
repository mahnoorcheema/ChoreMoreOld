# Chore More
A chore tracking application for SEG2105.

## Documentation
Documentation in the form of deliverables is kept on google docs and can be found [here.](https://docs.google.com/document/d/1hjCYiwQDpRwE42onnrBQOMQdaRyXxQ7Bzp6JxsNtucc/edit)

## Assignment Marking
The marking scheme for this assignment can be found on the professor's public twiki page [here.](http://cserg0.site.uottawa.ca/seg/bin/view/SEG2105/MarkingProject)

## Conventions
### Github
Please do not add the .idea folder files to the repo. I believe that these are IDE only settigns and should be kept locally only.

Please write descriptive commit messages that detail why the changes you made were done they were, opposed to how they were made (the source code should speak for itself on that front). For more info on how to write a good commit message check [here](https://chris.beams.io/posts/git-commit/)

### Resource IDs
For the sake of internal consistency please use the following convention when naming XML elements.

`what_where_name`

The what should be a two letter code representing the type of widget. For example a text view would be preceeded by `tv`, a list view `lv` and so on.
The where should reference the layout resource file that the element belongs to. For example, a view in the activity_main.xml should use the word `main`.
The name should describe the purpose of the element. For example a widget that holds the title of the page would have a name `title`.

Following these rules the resource ID of a title text view in the main activity would be named `tv_main_title`.

### Variable Naming
Variable should follow the camel case convention. Google's docs on Android naming convention specifically outlines that variable names that include acronyms should be capitalized as if the acronym is a single word.
For example, when naming a variable which holds a parsed HTML document the appropriate casing would be `parsedHtmlDoc`.

### String Resources
For the sake of maintainability please do not hard code **ANY** text present in UI elements. Instead, please use the string resource file with appropriate resource names. 

## Pre-Push Checklist
  * Feature branch is up to date with master.
  * Android studio warnings have been addressed.
  * Todo statements have been added to incomplete functionality.
  * Comments describing non-obvious implementation have been added.
