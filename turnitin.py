#!/usr/bin/env python3

"""Module for turnitin."""

__author__ = 'Alexander Winkler'
__date__ = '4/4/2024'


def main():
    """Translated input.

    Args:
        None

    Returns:
        None
    """
    array = []
    array2 = []
    str1 = input("String 1? ")
    str2 = input("\nString 2? ")
    # Return each word to array from string to use .join
    final, final2 = joinreplace(str1, str2, array, array2)
    print(f"\n {str1} simplifies to {final}")
    print(str2, "simplifies to", final2)
    if final == final2:
        print("SAME")
    else:
        print("DIFFERENT")


def joinreplace(str1, str2, array, array2):
    """Prompt user for needed input.

    Args:
        str1 (str): first input
        str2 (str): second input
        array (arrray): Each word in users input string
        array2 (array): Each word in users input string

    Returns:
        final (str): Users first string formatted
        final2 (str): Users second string formatted
    """
    for word in str1.split():
        array.append(word)
    final = "-".join(array).replace(".", "").replace(",", "")
    final = final.lower()
    for word in str2.split():
        array2.append(word)
    final2 = "-".join(array2).replace(".", "").replace(",", "")
    final2 = final2.lower()
    return final, final2


if __name__ == "__main__":
    main()