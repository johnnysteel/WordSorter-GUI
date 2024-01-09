# WordSorter

## Overview

WordSorter is a GUI-based Java application designed to categorize words based on their initial character. Words are sorted into one of six boxes, depending on whether they start with a vowel ('a', 'e', 'i', 'o', 'u') or a consonant. The application ensures that only valid words are included; any word containing invalid characters triggers an `IllegalWordException`.

## Features

- **Categorization**: Automatically sort words into six different boxes based on their starting letter.
- **Word Validation**: Filter out any words with numbers or symbols, ensuring only valid words are displayed.
- **File Operations**: Open and load a list of words from a local file.
- **Word Addition**: Add new words through the GUI, which will be sorted immediately.
- **Graceful Exit**: Quit the program through the file menu option.

## Installation

Ensure you have Java installed on your system (JRE or JDK 8 or higher).

1. Download the WordSorter repository.
2. Compile the source files using `javac` or your favorite IDE.
3. Run the main class to start the application.

## Usage

Upon launching WordSorter, the GUI will present you with several options:

- **File Menu**:
  - **Open**: Load a list of words from your computer into the application.
  - **Quit**: Terminate the program.
- **Edit Menu**:
  - **Add**: Add a new word to the GUI, which will be sorted into the appropriate box.

The main interface consists of six boxes where words are sorted:

1. First box: Words starting with 'a'.
2. Second box: Words starting with 'e'.
3. Third box: Words starting with 'i'.
4. Fourth box: Words starting with 'o'.
5. Fifth box: Words starting with 'u'.
6. Sixth box: Words starting with a consonant.

Invalid words will not appear in any box and will trigger an `IllegalWordException`.

![image](https://github.com/johnnysteel/WordSorter-GUI/assets/77905977/1ce5d83c-2b70-4450-95f9-d089040b86cb)
![image](https://github.com/johnnysteel/WordSorter-GUI/assets/77905977/a9d68df1-bc56-40ae-9438-2a85c9de8cf4)
![image](https://github.com/johnnysteel/WordSorter-GUI/assets/77905977/e781c35a-fa9b-466a-9c76-d7ed3c04cb48)


## Requirements

- Java Runtime Environment (JRE) or Java Development Kit (JDK) version 8 or higher.

## Contributing

If you'd like to contribute to the WordSorter project, please submit a pull request or open an issue to discuss your proposed changes.

## Contact

If you have any questions or would like to get in touch, please reach out to jnbissu589@gmail.com
