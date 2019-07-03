package org.apache.mxnet.engine;

import java.io.OutputStream;
import java.nio.Buffer;
import java.util.List;
import java.util.concurrent.locks.Condition;
import software.amazon.ai.Context;
import software.amazon.ai.ndarray.Matrix;
import software.amazon.ai.ndarray.NDArray;
import software.amazon.ai.ndarray.NDFactory;
import software.amazon.ai.ndarray.NDList;
import software.amazon.ai.ndarray.internal.NDArrayEx;
import software.amazon.ai.ndarray.types.DataDesc;
import software.amazon.ai.ndarray.types.DataType;
import software.amazon.ai.ndarray.types.Layout;
import software.amazon.ai.ndarray.types.Shape;
import software.amazon.ai.ndarray.types.SparseFormat;
import software.amazon.ai.training.GradReq;

public class MxMatrix implements Matrix {

    private MxNDArray array;

    public MxMatrix(MxNDArray array) {
        this.array = array;
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putRow(long row, NDArray toPut) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putColumn(int column, NDArray toPut) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getScalar(long row, long column) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray diviColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray divColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray diviRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray divRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rdiviColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rdivColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rdiviRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rdivRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray muliColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mulColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray muliRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mulRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rsubiColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rsubColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rsubiRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray rsubRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray subiColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray subColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray subiRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray subRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray addiColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putiColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray addColumnVector(NDArray columnVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray addiRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putiRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray addRowVector(NDArray rowVector) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getColumn(long i) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getRow(long i) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getColumns(int... columns) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getRows(int... rows) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray put(int i, int j, Number element) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public NDArray reshape(char order, int rows, int columns) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public double[][] toDoubleMatrix() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public float[][] toFloatMatrix() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public long[][] toLongMatrix() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public int[][] toIntMatrix() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /** {@inheritDoc} */
    @Override
    public byte[] getEncoded() {
        return array.getEncoded();
    }

    /** {@inheritDoc} */
    @Override
    public void encode(OutputStream os) {
        array.encode(os);
    }

    /** {@inheritDoc} */
    @Override
    public NDFactory getFactory() {
        return array.getFactory();
    }

    /** {@inheritDoc} */
    @Override
    public DataType getDataType() {
        return array.getDataType();
    }

    /** {@inheritDoc} */
    @Override
    public Context getContext() {
        return array.getContext();
    }

    /** {@inheritDoc} */
    @Override
    public Shape getShape() {
        return array.getShape();
    }

    /** {@inheritDoc} */
    @Override
    public Layout getLayout() {
        return array.getLayout();
    }

    /** {@inheritDoc} */
    @Override
    public DataDesc getDataDescriptor() {
        return array.getDataDescriptor();
    }

    /** {@inheritDoc} */
    @Override
    public void set(Buffer data) {
        array.set(data);
    }

    @Override
    public void set(float[] data) {
        array.set(data);
    }

    @Override
    public void set(int[] data) {
        array.set(data);
    }

    @Override
    public void set(double[] data) {
        array.set(data);
    }

    @Override
    public void set(long[] data) {
        array.set(data);
    }

    @Override
    public void set(byte[] data) {
        array.set(data);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray at(int index) {
        return array.at(index);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray slice(int begin, int end) {
        return array.slice(begin, end);
    }

    /** {@inheritDoc} */
    @Override
    public void copyTo(NDArray arr) {
        array.copyTo(arr);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray asInContext(Context ctx, boolean copy) {
        return array.asInContext(ctx, copy);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray asType(DataType dtype, boolean copy) {
        return array.asType(dtype, copy);
    }

    /** {@inheritDoc} */
    @Override
    public void attachGrad() {
        array.attachGrad();
    }

    /** {@inheritDoc} */
    @Override
    public void attachGrad(GradReq gradReq, SparseFormat sparseFormat) {
        array.attachGrad(gradReq, sparseFormat);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getGradient() {
        return array.getGradient();
    }

    /** {@inheritDoc} */
    @Override
    public void backward() {
        array.backward();
    }

    /** {@inheritDoc} */
    @Override
    public void backward(boolean retainGraph, boolean isTraining) {
        array.backward(retainGraph, isTraining);
    }

    /** {@inheritDoc} */
    @Override
    public void backward(NDArray outGrad, boolean retainGraph, boolean isTraining) {
        array.backward(outGrad, retainGraph, isTraining);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray argsort(int axis, boolean ascending) {
        return array.argsort(axis, ascending);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray softmax(int[] axes, double temperature) {
        return array.softmax(axes, temperature);
    }

    @Override
    public NDArray softmax(int[] axes) {
        return array.softmax(axes);
    }

    /** {@inheritDoc} */
    @Override
    public NDList split(int axis, boolean squeezeAxis) {
        return array.split(axis, squeezeAxis);
    }

    /** {@inheritDoc} */
    @Override
    public NDList split(int axis, int numOutputs) {
        return array.split(axis, numOutputs);
    }

    @Override
    public NDArray add(Number n) {
        return array.add(n);
    }

    @Override
    public NDArray addi(Number n) {
        return array.addi(n);
    }

    @Override
    public NDArray add(NDArray other) {
        return array.add(other);
    }

    @Override
    public NDArray addi(NDArray other) {
        return array.addi(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray zerosLike() {
        return array.zerosLike();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray onesLike() {
        return array.onesLike();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isSparse() {
        return array.isSparse();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray cumsumi(int dimension) {
        return array.cumsumi(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray cumsum(int dimension) {
        return array.cumsum(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray assign(NDArray arr) {
        return array.assign(arr);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray assignIf(NDArray arr, Condition condition) {
        return array.assignIf(arr, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray replaceWhere(NDArray arr, Condition condition) {
        return array.replaceWhere(arr, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putScalar(long value, long... dimension) {
        return array.putScalar(value, dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putScalar(double value, long... dimension) {
        return array.putScalar(value, dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putScalar(float value, long... dimension) {
        return array.putScalar(value, dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putScalar(int value, long... dimension) {
        return array.putScalar(value, dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray eps(Number other) {
        return array.eps(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray eps(NDArray other) {
        return array.eps(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray eq(Number other) {
        return array.eq(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray eq(NDArray other) {
        return array.eq(other);
    }

    /** {@inheritDoc} */
    @Override
    public boolean contentEquals(NDArray other) {
        return array.contentEquals(other);
    }

    /** {@inheritDoc} */
    @Override
    public boolean contentEquals(Number number) {
        return array.contentEquals(number);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray gt(Number other) {
        return array.gt(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray neq(Number other) {
        return array.neq(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray neq(NDArray other) {
        return array.neq(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray gt(NDArray other) {
        return array.gt(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray gte(Number other) {
        return array.gte(other);
    }

    @Override
    public NDArray gte(NDArray other) {
        return array.gte(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray lte(Number other) {
        return array.lte(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray lt(Number other) {
        return array.lt(other);
    }

    @Override
    public NDArray lte(NDArray other) {
        return array.lte(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray lt(NDArray other) {
        return array.lt(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray isInfinite() {
        return array.isInfinite();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray isNaN() {
        return array.isNaN();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray neg() {
        return array.neg();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray negi() {
        return array.negi();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray div(Number n) {
        return array.div(n);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray divi(Number n) {
        return array.divi(n);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mul(Number n) {
        return array.mul(n);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray muli(Number n) {
        return array.muli(n);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray sub(Number n) {
        return array.sub(n);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray subi(Number n) {
        return array.subi(n);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray match(NDArray comp, Condition condition) {
        return array.match(comp, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray match(Number comp, Condition condition) {
        return array.match(comp, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getWhere(NDArray comp, Condition condition) {
        return array.getWhere(comp, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getWhere(Number comp, Condition condition) {
        return array.getWhere(comp, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putWhere(NDArray comp, NDArray put, Condition condition) {
        return array.putWhere(comp, put, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putWhere(Number comp, NDArray put, Condition condition) {
        return array.putWhere(comp, put, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putWhereWithMask(NDArray mask, NDArray put) {
        return array.putWhereWithMask(mask, put);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putWhereWithMask(NDArray mask, Number put) {
        return array.putWhereWithMask(mask, put);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putWhere(Number comp, Number put, Condition condition) {
        return array.putWhere(comp, put, condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray get(NDArray indices) {
        return array.get(indices);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray get(List<List<Integer>> indices) {
        return array.get(indices);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray assign(Number value) {
        return array.assign(value);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray putSlice(int slice, NDArray put) {
        return array.putSlice(slice, put);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray cond(Condition condition) {
        return array.cond(condition);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray tile(int repeats) {
        return array.tile(repeats);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray tile(int axis, int repeats) {
        return array.tile(axis, repeats);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray tile(int[] repeats) {
        return array.repeat(repeats);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray tile(Shape desiredShape) {
        return array.tile(desiredShape);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray repeat(int repeats) {
        return array.repeat(repeats);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray repeat(int axis, int repeats) {
        return array.repeat(axis, repeats);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray repeat(int[] repeats) {
        return array.repeat(repeats);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray repeat(Shape desiredShape) {
        return array.repeat(desiredShape);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getScalar(long i) {
        return array.getScalar(i);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray put(List<List<Integer>> indices, NDArray element) {
        return array.put(indices, element);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray put(NDArray indices, NDArray element) {
        return array.put(indices, element);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray put(NDArray element, int... indices) {
        return array.put(element, indices);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray put(int i, NDArray element) {
        return array.put(i, element);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mmul(NDArray other) {
        return array.mmul(other);
    }

    /** {@inheritDoc} */
    @Override
    public double[] toDoubleArray() {
        return array.toDoubleArray();
    }

    /** {@inheritDoc} */
    @Override
    public float[] toFloatArray() {
        return array.toFloatArray();
    }

    /** {@inheritDoc} */
    @Override
    public int[] toIntArray() {
        return array.toIntArray();
    }

    /** {@inheritDoc} */
    @Override
    public long[] toLongArray() {
        return array.toLongArray();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mmul(NDArray other, NDArray result) {
        return array.mmul(other, result);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray div(NDArray other) {
        return array.div(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mul(NDArray other) {
        return array.mul(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray sub(NDArray other) {
        return array.sub(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mmuli(NDArray other) {
        return array.mmuli(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mmuli(NDArray other, NDArray result) {
        return array.mmuli(other, result);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray divi(NDArray other) {
        return array.divi(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray muli(NDArray other) {
        return array.muli(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray subi(NDArray other) {
        return array.subi(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray amax(int... dimension) {
        return array.amax(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public Number amaxNumber() {
        return array.amaxNumber();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray amin(int... dimension) {
        return array.amin(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public Number aminNumber() {
        return array.aminNumber();
    }

    /** {@inheritDoc} */
    @Override
    public Number max() {
        return array.max();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray max(int[] axes, boolean keepDims) {
        return array.max(axes, keepDims);
    }

    /** {@inheritDoc} */
    @Override
    public Number min() {
        return array.min();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray min(int[] axes, boolean keepDims) {
        return array.min(axes, keepDims);
    }

    /** {@inheritDoc} */
    @Override
    public Number sum() {
        return array.sum();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray sum(int[] axes, boolean keepDims) {
        return array.sum(axes, keepDims);
    }

    /** {@inheritDoc} */
    @Override
    public Number prod() {
        return array.prod();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray prod(int[] axes, boolean keepDims) {
        return array.prod(axes, keepDims);
    }

    /** {@inheritDoc} */
    @Override
    public Number mean() {
        return array.mean();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray mean(int[] axes, boolean keepDims) {
        return array.mean(axes, keepDims);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getScalar(int... indices) {
        return array.getScalar(indices);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray getScalar(long... indices) {
        return array.getScalar(indices);
    }

    /** {@inheritDoc} */
    @Override
    public long getLong(int... indices) {
        return array.getLong(indices);
    }

    /** {@inheritDoc} */
    @Override
    public long getLong(long... indices) {
        return array.getLong(indices);
    }

    /** {@inheritDoc} */
    @Override
    public double getDouble(int... indices) {
        return array.getDouble(indices);
    }

    /** {@inheritDoc} */
    @Override
    public double getDouble(long... indices) {
        return array.getDouble(indices);
    }

    /** {@inheritDoc} */
    @Override
    public float getFloat(int... indices) {
        return array.getFloat(indices);
    }

    /** {@inheritDoc} */
    @Override
    public float getFloat(long... indices) {
        return array.getFloat(indices);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray dup() {
        return array.dup();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray slice(long i, int dimension) {
        return array.slice(i, dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray slice(long i) {
        return array.slice(i);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray flatten() {
        return array.flatten();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray reshape(Shape shape) {
        return array.reshape(shape);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray swapAxes(int dimension, int with) {
        return array.swapAxes(dimension, with);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray transpose(int... dimensions) {
        return array.transpose(dimensions);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray transposei(int... dimensions) {
        return array.transposei(dimensions);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray expandDims(int axis) {
        return array.expandDims(axis);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray stack(NDArray[] arrays, int axis) {
        return array.stack(arrays, axis);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray stack(NDList arrays, int axis) {
        return array.stack(arrays, axis);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray concat(NDArray[] arrays, int axis) {
        return array.concat(arrays, axis);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray clip(double min, double max) {
        return array.clip(min, max);
    }

    /** {@inheritDoc} */
    @Override
    public long size(int dimension) {
        return array.size(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public long size() {
        return array.size();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray broadcast(long... shape) {
        return array.broadcast(shape);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray broadcast(NDArray result) {
        return array.broadcast(result);
    }

    /** {@inheritDoc} */
    @Override
    public Object element() {
        return array.element();
    }

    /** {@inheritDoc} */
    @Override
    public boolean equalsWithEps(Object o, double eps) {
        return array.equalsWithEps(o, eps);
    }

    /** {@inheritDoc} */
    @Override
    public boolean equalShapes(NDArray other) {
        return array.equalShapes(other);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray remainder(NDArray denominator) {
        return array.remainder(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray remainder(NDArray denominator, NDArray result) {
        return array.remainder(denominator, result);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray remainder(Number denominator) {
        return array.remainder(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray remainder(Number denominator, NDArray result) {
        return array.remainder(denominator, result);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray remainderi(NDArray denominator) {
        return array.remainderi(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray remainderi(Number denominator) {
        return array.remainderi(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray fmod(NDArray denominator) {
        return array.fmod(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray fmod(NDArray denominator, NDArray result) {
        return array.fmod(denominator, result);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray fmod(Number denominator) {
        return array.fmod(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray fmod(Number denominator, NDArray result) {
        return array.fmod(denominator, result);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray fmodi(NDArray denominator) {
        return array.fmodi(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray fmodi(Number denominator) {
        return array.fmodi(denominator);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray argMax(int... dimension) {
        return array.argMax(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public Number percentileNumber(Number percentile) {
        return array.percentileNumber(percentile);
    }

    /** {@inheritDoc} */
    @Override
    public Number medianNumber() {
        return array.medianNumber();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray median(int... dimension) {
        return array.median(dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray percentile(Number percentile, int... dimension) {
        return array.percentile(percentile, dimension);
    }

    /** {@inheritDoc} */
    @Override
    public NDArray toDense() {
        return array.toDense();
    }

    /** {@inheritDoc} */
    @Override
    public int nonzero() {
        return array.nonzero();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray castTo(DataType dataType) {
        return array.castTo(dataType);
    }

    /** {@inheritDoc} */
    @Override
    public Matrix asMatrix() {
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public boolean all() {
        return array.all();
    }

    /** {@inheritDoc} */
    @Override
    public boolean any() {
        return array.any();
    }

    /** {@inheritDoc} */
    @Override
    public boolean none() {
        return array.none();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray like() {
        return array.like();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray ulike() {
        return array.ulike();
    }

    /** {@inheritDoc} */
    @Override
    public NDArrayEx getNDArrayInternal() {
        return array.getNDArrayInternal();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray logicalNot() {
        return array.logicalNot();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray square() {
        return array.square();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray abs() {
        return array.abs();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray cbrt() {
        return array.cbrt();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray floor() {
        return array.floor();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray ceil() {
        return array.ceil();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray round() {
        return array.round();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray trunc() {
        return array.trunc();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray exp() {
        return array.exp();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray log() {
        return array.log();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray log10() {
        return array.log10();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray log2() {
        return array.log2();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray sin() {
        return array.sin();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray cos() {
        return array.cos();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray tan() {
        return array.tan();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray asin() {
        return array.asin();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray acos() {
        return array.acos();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray atan() {
        return array.atan();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray toDegrees() {
        return array.toDegrees();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray toRadians() {
        return array.toRadians();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray sinh() {
        return array.sinh();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray cosh() {
        return array.cosh();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray tanh() {
        return array.tanh();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray asinh() {
        return array.asinh();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray acosh() {
        return array.acosh();
    }

    /** {@inheritDoc} */
    @Override
    public NDArray atanh() {
        return array.atanh();
    }

    /** {@inheritDoc} */
    @Override
    public void close() {
        array.close();
    }
}