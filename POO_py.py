class Corrida:
    def __init__(self, color, body_kit, airfoil, engine, direction, transmission, tire, brake, nitro, turbo):
        self.color = color
        self.body_kit = body_kit
        self.airfoil = airfoil

        self.engine = engine
        self.direction = direction
        self.transmission = transmission
        self.tire = tire
        self.brake = brake
        self.nitro = nitro
        self.turbo = turbo

        pass

    def power(self):
        self.cv_power = self.engine + self.turbo

        pass

    def torque(self):
        self.torque = self.cv_power * 1.5

        pass

