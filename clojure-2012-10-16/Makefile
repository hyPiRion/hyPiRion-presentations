PRESENTATION = presentation
TEMPS = aux log nav out snm toc vrb

.PHONY: clean remake purge

all: $(PRESENTATION).pdf

%.pdf:
	pdflatex $(@:.pdf=.tex)
	pdflatex $(@:.pdf=.tex)

clean:
	for s in $(TEMPS); do rm -f $(PRESENTATION).$$s; done

purge: clean
	rm -f $(PRESENTATION).pdf

remake: | purge all
