package com.cgvsu.math.matrix;

import com.cgvsu.math.exception.MathExceptions;
import com.cgvsu.math.vector.Vector;
import com.cgvsu.math.vector.Vector3F;

public class Matrix3F extends AbstractSquareMatrix implements Matrix {

    public Matrix3F(float[][] values) {
        if (checkLengthInputValues(values)) {
            super.value = values;
            super.size = values.length;
        } else {
            throw new MathExceptions();
        }
    }

    public Matrix3F() {
    }

    @Override
    public void setZeroMatrix() {
        super.size = 3;
        super.value = new float[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
    }

    @Override
    public void setSingleMatrix() {
        super.size = 3;
        super.value = new float[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

    }

    @Override
    protected boolean checkLengthInputValues(final float[][] values) {
        return values.length == 3 && values[0].length == 3 && values[1].length == 3 && values[2].length == 3;
    }

    @Override
    public Vector productMatrixOnVector(final Matrix m1, final Vector v1) {

        Vector vRes = new Vector3F();

        float[] tmp = super.getMatrixAfterProductMatrixOnVector(m1, v1);

        vRes.setValues(tmp);
        return vRes;
    }

}