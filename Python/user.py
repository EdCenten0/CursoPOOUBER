from account import Account

class User(Account):

    def __init__(self, id, name, password, email, document):
        super().__init__(id, name, password, email, document)

    