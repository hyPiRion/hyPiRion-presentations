# Egenskapsbasert Testing

Norwegian presentation of property-based testing. You can watch it over at
<http://hypirion.com/talks/egenskapsbasert-testing/presentation.html>, or build
it yourself if you want to.

To build, jump into the directory `prop-based-testing` and issue the following
commands:

```shell
git submodule init
git submodule update
lein cljsbuild once production
cp production/org-html-slideshow.js ../org-html-slideshow.js
```

Now, open up the org-file named `presentation.org` and press <kbd>y</kbd> when
prompted for variables. Then issue <kbd>C-c C-e h h</kbd> to create
`presentation.html`.
