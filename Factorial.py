class Factorial(object):

    @staticmethod
    def factorial(number):
        if number < 0:
            raise ValueError("Cannot get factorial of negative value")
        if number == 0:
            return 1
        return number * Factorial.factorial(number -1)
