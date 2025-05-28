
# Java Fundamentals – Clear and Concise Notes


## 🐧 Linux Essentials

### Terminal / CLI
- The terminal lets you talk to your computer using text commands.
- Think of it like messaging your computer instructions.

### Filesystem Basics
- Important folders:
    - `/` = root of the system
    - `/home` = users’ personal files
    - `/etc` = system settings
    - `/tmp` = temporary files
    - `~` = your home folder
- Path types:
    - Absolute: starts from root (`/`)
    - Relative: starts from where you are

### Common Commands
```bash
cd folder      # move to folder
pwd            # print current location
ls -lah        # list files in detail
mkdir name     # make a folder
touch file     # make a file
rmdir folder   # remove empty folder
rm file        # remove file
rm -rf folder  # force remove folder and contents
cp source dest # copy file/folder
mv old new     # rename or move
ls *name*      # list files matching a pattern
```
- Use `less`, `man`, `help`, and `nano` to explore help and edit files.

---

## 👤 Users and Software Installation

### Users and Permissions
- Users belong to groups, and files have read/write/execute rights.
- `sudo` gives you temporary superpower access (admin).

### Installing Software
- Use APT (on Debian/Ubuntu):
  ```bash
  sudo apt update          # refresh package list
  sudo apt install name    # install a package
  sudo apt remove name     # remove it
  ```
- Use `snap install name` for snap-based apps.
- "LTS" means Long-Term Support — stable and reliable.

---

## 🌐 Internet & Networking Basics

- **URL**: Uniform Resource Locator (like https://example.com)
- **HTTP/HTTPS**: Protocols for web communication. HTTPS is secure.
- **DNS**: Converts domain names to IP addresses (like a phonebook).
- **IP Address**: A computer’s address on a network.

---

## 🗂 Versioning and Git

### What is Version Control?
- Keeps track of your code changes.
- Like "undo" for programmers, but smarter.

### VS Code & Git
- VS Code is a flexible code editor.
- Git tracks versions of your files.

### Git Basics
```bash
git init        # start a repo
git add .       # stage changes
git commit -m "Message"   # save snapshot
```

### Branching and Merging
- Work on different features in separate branches.
- `git merge` combines them back together.

---

## 🌍 GitHub & Collaboration

- GitHub hosts your code online.
- You can share, collaborate, and contribute.

### Pull Requests & Code Review
- You suggest changes via pull requests.
- Teammates can review and approve or request updates.

### Handling Conflicts
- Happens when two people change the same line of code.
- Git shows the conflict; you fix it manually.

### Open Source & Forking
- Fork = copy someone’s repo to your account.
- Used to contribute to public projects.

---

## 💻 Web Page Programming Basics

### What Can a Website Do?
- Display info, collect data, show media, interact with users.

### HTML and CSS
- HTML: content (headings, paragraphs, buttons)
- CSS: style (colors, borders, layout)
- "Everything is a box" — each element is a box.

### JavaScript Basics
- Adds interactivity: form validation, animation, etc.

### GitHub Pages
- You can host a basic site for free using GitHub.

---

## ⚙ Agile Vocabulary

- Agile: a way of working in small, adaptive steps.
- Waterfall: a traditional, step-by-step method.

### Key Terms
- **Scope**: What needs to be done.
- **Sprint**: Short time frame to deliver something.
- **Scrum / Kanban**: Project management methods.
- **User Story**: A small unit of work from the user's point of view.
- **Epic**: A group of related user stories.
- **MVP/MLP**: Minimal versions to test ideas.

---

## ☕ Programming & Tooling

### What is Programming?
- Giving clear instructions to a computer.

### How Programs Work
- A program is turned into machine code and run by your CPU.

### Compiled vs Interpreted
- **Compiled**: Translated to machine code (Java)
- **Interpreted**: Read line-by-line (Python)

### Java Setup
- Install Java SDK and IntelliJ IDEA (your main editor).
- Write and run your first program: `Hello World!`

---

## ✅ Summary

You’ve now covered:
- System basics with Linux
- How to install and manage software
- Version control with Git & GitHub
- Website programming basics
- Working in Agile teams
- Java and programming fundamentals

👉 You're now ready to dive deeper into Java coding and real project work!
