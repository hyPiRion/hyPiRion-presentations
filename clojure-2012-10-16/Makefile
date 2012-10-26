PRESENTATION = presentation
TEMPS = aux log nav out snm toc vrb pyg

.PHONY: clean remake purge

all: $(PRESENTATION).pdf

%.pdf:
	pdflatex -shell-escape $*.tex
	pdflatex -shell-escape $*.tex

clean:
	for s in $(TEMPS); do rm -f $(PRESENTATION).$$s; done

purge: clean
	-rm -f $(PRESENTATION).pdf

remake:
	-rm -f $(PRESENTATION).pdf
	$(MAKE) all
