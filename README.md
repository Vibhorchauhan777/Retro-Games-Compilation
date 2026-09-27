# Retro Games Compilation

Retro Games Compilation is a JavaFX-based collection of classic mini-games, including Memory Match, Tetris, and Hexagonal Chess.

## Features
- Memory Game with configurable difficulty and LAN multiplayer support
- Tetris with duel gameplay, swap power-ups, and custom piece design
- Hexagonal Chess with local, LAN, and AI opponent options
- JavaFX user interface and Maven-based project setup

## Prerequisites
- Java 21 or newer
- Maven 3.8+
- Local Area Network access for multiplayer sessions

## Build and run
```bash
mvn clean compile
mvn javafx:run
```

## Games included

### 1. Memory Game
Classic card-matching gameplay with LAN multiplayer. Players can set match size and deck size, compete across machines, and keep turns based on successful matches.

### 2. Tetris
A head-to-head Tetris mode with dual boards, custom piece design, piece preview, and LAN support.

### 3. Hexagonal Chess
A Glinski-style hexagonal chess variant with local play, LAN play, and optional computer opponent.

## Project stack
- Java 25
- JavaFX
- Maven
- JUnit 5

## Repository notes
This project is organized as a Maven JavaFX application and is intended to be run locally with Java and Maven installed.
