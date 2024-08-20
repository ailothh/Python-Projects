#!/usr/bin/env python3

"""Module for counting words."""

__author__ = 'Alexander Winkler'
__date__ = '4/11/2024'


def main():
    file = open('a.txt', 'r')
    dictionary = {}
    # read by line
    for line in file:
        line = line.lower()
        # Separate words in line into list
        for word in line.split():
            if word in dictionary:
            # Incrementing by 1
                dictionary[word] = dictionary[word] + 1
            else:
            # Not incrementing past 1
                dictionary[word] = 1
    # Output
    for key in list(dictionary.keys()):
        print(key, ":", dictionary[key])


if __name__ == "__main__":
    main()