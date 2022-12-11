from account import Account

class Driver(Account):

    def __init__(self, id, name, password, email, document):
        super().__init__(id, name, password, email, document)
        
    