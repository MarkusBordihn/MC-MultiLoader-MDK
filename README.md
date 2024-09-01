# MC-MultiLoader-MDK (Minecraft Multi-Loader Mod Developer Kit) - 1.18.2

[![Java CI with Gradle](https://github.com/MarkusBordihn/MC-MultiLoader-MDK/actions/workflows/gradle.yml/badge.svg)](https://github.com/MarkusBordihn/MC-MultiLoader-MDK/actions/workflows/gradle.yml)

MC-MultiLoader-MDK is a Minecraft Mod Developer Kit designed to streamline the creation of mods
compatible with multiple mod loaders, including Forge, Fabric, and Neo Forge.

I created this project to simplify my mod development workflow and provide a consistent and
reliable way to develop mods that work across different mod loaders.

This repository provides a set of multi-loader templates that allow you to develop mods without
relying on additional dependencies, ensuring maximum compatibility and ease of use.

Key Features:

* Multi-Loader Support: Seamlessly create mods that work across Forge, Fabric, and Neo Forge with a
  single codebase.
* Modular Design: Focus on modular development practices to ensure that your mods are flexible,
  maintainable, and scalable.
* Best Practices: Detailed guidelines and examples on how to design and structure your mods for
  cross-loader compatibility without introducing unnecessary dependencies.

Whether you're a seasoned modder or new to Minecraft mod development, MC-MultiLoader-MDK provides
the tools and documentation you need to build high-quality, multi-loader mods efficiently.

## Status

This project is currently under development and is not yet ready for production use.

## Requirements

The MC-MultiLoader-MDK is only tested and supported with IntelliJ IDEA.

You can download the latest version of [IntelliJ IDEA][intellij-idea] from the official website.

For open source projects, make sure to start with the free **IntelliJ IDEA Community Edition** and
not the **IntelliJ IDEA Ultimate** edition.

If you are using a different IDE, you may need to adjust the project configuration and settings to
ensure compatibility.

However, I highly recommend using [IntelliJ IDEA][intellij-idea] for mod development, as it provides
excellent support for Java development and Minecraft modding.

### Recommended IntelliJ Plugins

The following plugins are recommended for mod development with MC-MultiLoader-MDK:

* [Google Java Format](https://plugins.jetbrains.com/plugin/8527-google-java-format)
* [Minecraft Development](https://plugins.jetbrains.com/plugin/8327-minecraft-development)
* [Sonar Lint](https://plugins.jetbrains.com/plugin/7973-sonarlint)
* [String Manipulation](https://plugins.jetbrains.com/plugin/2162-string-manipulation)

## Getting Started

Create a new project folder and use NPM to create a new project based on the MC-MultiLoader-MDK.

Use the following command to create a new project:

```bash
npx mc-multi-loader-mdk new
```

After entering the required information, the project will be created in a new project folder.
Open the project in IntelliJ IDEA and start developing your mod.

## Project Placeholder

This project uses placeholders to ensure that the project is correctly set up for each mod loader.

You can automatically replace these placeholders by running the command
`npx mc-multi-loader-mdk new`.

If you prefer to replace the placeholders manually, you can use the following table as a reference:

| Placeholder                      | Description                         | Example                          |
|----------------------------------|-------------------------------------|----------------------------------|
| `org.example.examplemod`         | The package name of your mod.       | `org.example.examplemod`         |
| `ExampleMod`                     | The class name of your mod.         | `ExampleMod`                     |
| `https://example.org/examplemod` | The website of the mod.             | `https://example.org/examplemod` |
| `https://example.org/issues`     | The issue tracker of the mod.       | `https://example.org/issues`     |
| `example_mod`                    | The unique identifier for your mod. | `example_mod`                    |
| `__MOD_NAME__`                   | The name of your mod.               | `Example Mod`                    |
| `__MOD_VERSION__`                | The version of your mod.            | `1.0.0`                          |
| `__MOD_DESCRIPTION__`            | A brief description of your mod.    | `A simple example mod`           |
| `__MOD_AUTHOR__`                 | The author of the mod.              | `John Doe`                       |
| `__MOD_LICENSE__`                | The license of the mod.             | `MIT`                            |

## GitHub Actions

This project uses GitHub Actions to automate the build process and ensure code quality.

[intellij-idea]: https://www.jetbrains.com/idea/download/
