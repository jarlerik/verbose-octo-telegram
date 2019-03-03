# verbose-octo-telegram

My first Clojure project.

Steps done so far to kick things off.

## Tools
 Atom with [slick Clojure setup](https://medium.com/@jacekschae/slick-clojure-editor-setup-with-atom-a3c1b528b722)

## Coding stuff

1. lein new <project_name>
2.  added dep ring "1.6.3" to project.clj
3. Configured some stuff
  :main [verbose_octo_telegram.core/main]
  :aot [verbose_octo_telegram.core]
  :ring {:handler verbose_octo_telegram.core/handler}
  :plugins [[lein-ring "0.12.5"]])

4. Created some handler functions and main

5. Created Dockerfile


## Usage

### Run dev

lein ring server-headless

### Build and run in Docker

1. lein uberjar
2. docker build -t verbose_octo_telegram .
3. docker run -p 3000:3000 verbose_octo_telegram

## TODO

1. Test setup
2. Some RESTful APIs
3. DB connection
4. Session handling




## License

Copyright © 2019 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
