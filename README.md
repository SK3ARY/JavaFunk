<style>
    h1 {
        display: flex;
        align-items: center; /* Vertically center logo and text */
        justify-content: center; /* Horizontally center the content */
    }

    .logo {
        margin-right: 10px; /* Add some space between logo and text */
        width: auto;
        height: 70px;
    }

    .subtitle {
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .description {
        text-align: center;
    }
</style>

<h1>
    <img src="logo.png" alt="logo" class="logo"/>
    <span class="h1-text">JavaFunk</span>
</h1>

<small class="subtitle">A rendition of the BrainFuck compiler made in Java</small>

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
