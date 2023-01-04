package com.cgvsu.math;

import com.cgvsu.math.vector.Vector;
import com.cgvsu.math.vector.Vector2F;
import com.cgvsu.math.vector.Vector3F;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Vector3FTest {

    @Test
    void testVectorProduct() {
        float[] vectorFirst = new float[]{-3.333f, 0.898f};
        float[] vectorSecond = new float[]{-4.21f, 2.34f, 1};
        Vector v1 = new Vector2F(vectorFirst);
        Vector v2 = new Vector3F(vectorSecond);
        v1.vectorCrossProduct(v1, v2);
        assertNull(v1.vectorCrossProduct(v1, v2));

        vectorFirst = new float[]{-3.333f, 0.898f};
        vectorSecond = new float[]{-4.21f, 2.34f};
        v1 = new Vector2F(vectorFirst);
        v2 = new Vector2F(vectorSecond);
        assertNull(v1.vectorCrossProduct(v1, v2));


        vectorFirst = new float[]{-3.333f, 0.898f, 1.87f};
        vectorSecond = new float[]{-4.21f, 2.34f, 0.22f};
        v1 = new Vector3F(vectorFirst);
        v2 = new Vector3F(vectorSecond);

        float[] expected = new float[]{-4.17824f, -7.13944f, -4.01864f};
        assertArrayEquals(expected, v1.vectorCrossProduct(v1, v2).getValues(), 0.000001f);
    }
}