import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(0, 3, 100)
y1 = x
y2 = 3*x - x**2

plt.plot(x, y1, label='y = x')
plt.plot(x, y2, label='y = 3x - x^2')
plt.fill_between(x, y1, y2, where=(y1 <= y2), color='gray', alpha=0.5)

plt.xlabel('x')
plt.ylabel('y')
plt.legend()
plt.grid(True)
plt.show()
