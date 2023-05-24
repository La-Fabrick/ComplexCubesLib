package eu.lafabrick.complexcubeslib.utils

import org.apache.commons.numbers.complex.Complex
import org.bukkit.Location

object LocationHelper {
    /**
     * Turn location into complex number (x is the real part and z is the imaginary part)
     * @param l The location
     * @return the complex number
     */
    fun locationToComplex(l: Location): Complex {
        return Complex.ofCartesian(l.x, l.z)
    }

    /**
     * Turn location into complex number (x is the real part and y is the imaginary part)
     * @param l The location
     * @return the complex number
     */
    fun locationToComplexXY(l: Location): Complex {
        return Complex.ofCartesian(l.x, l.y)
    }

    /**
     * Turn location into complex number (z is the real part and y is the imaginary part)
     * @param l The location
     * @return the complex number
     */
    fun locationToComplexZY(l: Location): Complex {
        return Complex.ofCartesian(l.z, l.y)
    }

}