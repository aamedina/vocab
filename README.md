# io.github.aamedina/vocab
A deps-new template to create RDF vocabularies with Clojure.

## Usage

``` bash
clojure -Sdeps '{:deps {io.github.aamedina/vocab {:git/sha "85455e9d83106e75bd2fe9d5c8b9e2cb56c19891"}}}' -Tnew create :template aamedina/vocab :name net.wikipunk/example :rdfa/prefix "example" :rdfa/uri '"https://wikipunk.net/example/"' :git/sha '"e54ec56c3c17d6b2f6534942e74e2021783885df"'
```

### :rdfa/prefix 
names the vocabulary
### :rdfa/uri
provide the URI for the vocabulary
### :git/sha
provide the :git/sha for io.github.aamedina/rdf in deps.edn

## Notes

This is a template project for use with [deps-new](https://github.com/seancorfield/deps-new).

Assuming you have installed `deps-new` as your `new` "tool" via:

```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.5.0"}' :as new
```

## License
Copyright (c) 2023 Adrian Medina

Permission to use, copy, modify, and/or distribute this software for
any purpose with or without fee is hereby granted, provided that the
above copyright notice and this permission notice appear in all
copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL
DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
PERFORMANCE OF THIS SOFTWARE.
