# person.py

"""Module with Person class"""

__author__ = 'Alexander Winkler'
__date__ = '4/19/2024'


class Person:
    """Class to give a person specific beats per minute range.

        Attributes:
        name (float): persons name
        age (float): person age

    """
    def __init__(self, name="", age=21):
        """Constructor.

        Args:
            name (string): name of person
            age (int): age of person

        Returns:
            None
        """
        self.name = name
        self.age = age


    def __str__(self):
        """Converts object to a string.

        Args:
            None

        Returns:
            string (str): string version of the object
        """
        return f"{self.name} ({self.age} years old)"

    @property
    def age(self):
        """age getter.

        Args:
            None

        Returns:
            age (int): users age
        """
        return self._age

    @age.setter
    def age(self, age):
        """age setter.

        Args:
            age (int): users age

        Returns:
            None

        Raises:
            ValueError: if age is less than 20
        """
        if age > 20:
            self._age = age
        else:
            raise ValueError('invalid age')


    def get_target_rate(self):
        """Calculates the target rate

        Args:
            None

        Returns:
            valuestuple (tuple): min and max heart rate.
        """
        valuestuple = ((100, 170), (95, 162), (93, 157), (90, 153), (88, 149), (85, 145), (83, 140), (80, 136), (78, 132), (75, 128))
        if 20 <= self.age and self.age <= 29:
            return valuestuple[0]
        elif 30 <= self.age and self.age < 35:
            return valuestuple[1]
        elif 35 <= self.age and self.age < 40:
            return valuestuple[2]
        elif 40 <= self.age and self.age < 45:
            return valuestuple[3]
        elif 45 <= self.age and self.age < 50:
            return valuestuple[4]
        elif 50 <= self.age and self.age < 55:
            return valuestuple[5]
        elif 55 <= self.age and self.age < 60:
            return valuestuple[6]
        elif 60 <= self.age and self.age < 65:
            return valuestuple[7]
        elif 65 <= self.age:
            return valuestuple[8]