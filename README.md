

<h1 style="display: flex; align-items: center; justify-content: center;">
    <img src="logo.png" alt="logo" style="margin-right: 10px; width: auto; height: 70px;"/>
    <span>JavaFunk</span>
</h1>

<small style="display: flex; align-items: center; justify-content: center;">A rendition of the BrainFuck compiler made in Java</small>

<a id="description-anchor"></a>

<span class="description">For my AP Computer Science final project, I developed JavaFunk, a compiler written in Java. While the class focused on Java fundamentals, I already had prior experience with the language.  This allowed me to challenge myself by tackling a compiler, a project that deepened my understanding of compilation processes. Although I had designed roughly three programming languages previously, JavaFunk was my first using Java. This experience not only reinforced my Java skills but also provided valuable insights into the intricacies of the language.</span>

<hr>

### Table of contents
* <a href="#description-anchor">Description</a>
* <a href="#requirements">Requirements</a>
* <a href="#usage-overview">Usage & Examples</a>

<hr>

### Requirements

In order to run this compiler you must Java installed on your machine. You can do so by following the steps listed on the <i><a href="https://www.oracle.com/java/">Oracle Java</a></i> website.

### Syntax overview

`+` *increment current cell value*
<br>

`-` *decrement current cell value*
<br>

`<` *move pointer left (\*p -= 1)*
<br>

`>` *move pointer right (\*p += 1)*
<br>

`[` *start a loop*
<br>

`]` *if current cell value is not zero, \*p = (last loop start position)*

### Code samples

**Hello world!**
```
>++++++++[<+++++++++>-]<.>++++[<+++++++>-]<+.+++++++..+++.>>++++++[<+++++++>-]<++.------------.>++++++[<+++++++++>-]<+.<.+++.------.--------.>>>++++[<++++++++>-]<+.
```
