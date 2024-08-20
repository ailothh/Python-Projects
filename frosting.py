#!/usr/bin/env python3

"""Module for tubs of frosting."""

__author__ = 'Alexander Winkler'
__date__ = '3/16/2024'
import math
import locale as lc
from decimal import Decimal


def calculations(diameter, height, layers):
    """Prompt user for needed input.

    Args:
        diameter (int): diameter
        height (int): height
        layers (int): amount of layers

    Returns:
        tubs (Decimal) : tubs of frosting
        price (Decimal) : total cost
    """
    radius = diameter / 2
    area_each_layer = math.pi * math.pow(radius, 2)
    area_each_side = (math.pi * diameter) * height
    total = area_each_layer * layers + area_each_side
    tubs = math.ceil(total / 60)
    price = Decimal(tubs * 1.25)
    return tubs, price


def main():
    """Calculate price.

    Args:
        None

    Returns:
        None
    """
    result = lc.setlocale(lc.LC_ALL, '')
    if result == 'C':
        lc.setlocale(lc.LC_ALL, 'en_US')
    diameter = int(input("Diameter? "))
    height = int(input("\nHeight? "))
    layers = int(input("\nLayers? "))
    tubs, price = calculations(diameter, height, layers)
    print(f'\nNum tubs: {tubs:>5}')
    print(f'Price: {lc.currency(price, grouping=True):>8}')


if __name__ == "__main__":
    main()