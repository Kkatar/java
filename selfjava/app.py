#building app that can send notification in different ways like email, sms.
#create an abstract class Notification with abstract method send with parameter messege 
#create email notificatiom class and sms notification class that inherits from Notification class and implements the send method.
from abc import ABC, abstractmethod

class Notification(ABC):
    @abstractmethod
    def send(self, message):
        pass

class EmailNotification(Notification):
    def send(self, message):
        print(f"Sending email: {message}")

class SMSNotification(Notification):
    def send(self, message):
        print(f"Sending SMS: {message}")
notification = EmailNotification()
notification.send("Hello via Email!")
notification = SMSNotification()
notification.send("Hello via SMS!")