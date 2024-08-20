#!/usr/bin/env python3

"""Module for autocorrecting text."""

__author__ = 'Alexander Winkler'
__date__ = '4/13/2024'


def main():
    """ Get input from user.

    Args:
        None

    Returns:
        None
    """
    fileinput = input("File? ")
    file = open(fileinput, 'r')
    stringinput = input("\nLine? ")
    correctstring(file, stringinput)


def correctstring(file, stringinput):
    """Correct the string from file contents.

    Args:
        fileinput (str): file input
        stringinput (array): Users string

    Returns:
        None
    """
    updatedstring = []
    d = {}
    # Reading File
    for line in file:
        wrong, corrected = line.split('=')
        # Remove \n from end
        corrected = corrected.rstrip()
        # Add pairs to dictionary
        d.update({wrong: corrected})
    for word in stringinput.split():
        if word in d:
            updatedstring.append(d[word])
        else:
            updatedstring.append(word)
    print("\n")
    print(*updatedstring)


if __name__ == "__main__":
    main()