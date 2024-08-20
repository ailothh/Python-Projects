#!/usr/bin/env python3

"""Module for cipher."""

__author__ = 'Alexander Winkler'
__date__ = '04/02/2024'

def main():
    array = []
    array2 = []
    encryptedchars = 0;
    message = input("Message? ")
    plaintext = input("Plain alphabet? ")
    ciphertext = input("Cipher alphabet? ")
    for char in plaintext:
        array.append(char)
    
    for char in ciphertext:
        array2.append(char)

    for char in message:
        i=0
        if char == array2[i]:
            print(array[i])
            i = i+1
        else:
            i= i+1
            
    #print(f"Encrypted {encryptedchars} characters out of {length} characters")


if __name__ == "__main__":
    main()