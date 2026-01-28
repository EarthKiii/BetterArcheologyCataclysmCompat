# Contributing to Better Archeology Cataclysm Compat

Thank you for considering contributing to this project! Here are some guidelines to help you get started.

## How to Contribute

### Reporting Bugs

If you find a bug, please open an issue on GitHub with:
- A clear description of the problem
- Steps to reproduce
- Your Minecraft version, Forge version, and mod versions
- Any relevant log files

### Suggesting Features

Feature suggestions are welcome! Please open an issue describing:
- What you'd like to see added
- Why it would be useful
- How it might work

### Pull Requests

1. Fork the repository
2. Create a new branch for your feature (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Test thoroughly with both mods installed
5. Commit your changes (`git commit -m 'Add amazing feature'`)
6. Push to your branch (`git push origin feature/amazing-feature`)
7. Open a Pull Request

### Development Setup

1. Clone the repository
2. Download the required mod JARs (Better Archeology, Cataclysm) and place them in the `libs/` folder
3. Run `./gradlew build` to compile
4. Run `./gradlew runClient` to test in a development environment

### Code Style

- Follow standard Java conventions
- Use descriptive variable and method names
- Add comments for complex logic
- Keep mixins focused and minimal

## Questions?

Feel free to open an issue for any questions about contributing!
