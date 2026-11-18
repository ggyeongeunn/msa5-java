package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3];     // 길이 3의 인트 배열을 생성 및 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 3}; // 길이 3의 인트 배열을 생성 + 초기화 + 선언

        System.out.println(arr); // 자바에서 내부적으로 관리하는 주소값 출력
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));

        // 배열의 복사
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        copyArr[0] = 999;

        // System.arraycopy() 이용하여 깊은 복사
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int[originArrSystem.length * 2];
        System.arraycopy(
            originArrSystem,
            0,
            copyArrSystem,
            0,
            originArrSystem.length
        );
        copyArrSystem[0] = 999;

        // Arrays.copyof() 이용하여 깊은 복사 : origin의 원본을 유지하기 위한 복사
        int[] originArrArrays = {1, 2, 3};
//        int[] copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length); // 보통 이렇게 씀
        int[] copyArrArrays = new int[originArrArrays.length * 2];
        // length * 2가 의미 없어짐
        copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length);
        copyArrArrays[0] = 999;
//        int[] myCopy = myCopyOf(originArrArrays, originArrArrays.length);

        // 직접 구현
        int[] originFor = {1, 2, 3};
        int[] copyFor = new int[originFor.length * 2];
        for(int i = 0; i < originFor.length; i++) {
            copyFor[i] = originFor[i];
        }
        int idx = 0;
        for(int val : originFor) {
            copyFor[idx] = val;
            idx++;
        }

//        public static int[] myCopyOf(int[] src, int length) {
//            int[] copy = new int[length];
//            for(int i = 0; i < length; i++) {
//                copy[i] = src[i];
//            }
//
//        }

        // 다차원 배열
        int[][] multiArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(multiArr[1][1]);

        // -------------------------------------------
        // 배열의 API
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};

        // arr.length : 배열의 길이
        System.out.println(arr3.length);

        // (Arrays.equals(arr1, arr2) : 배열 비교
        System.out.println(Arrays.equals(arr3, arr4));

        // Arrays.deepEquals(arr1, arr2) : 다차원 배열의 비교
        int[][] deepArr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] deepArr2 = {{1, 2, 3}, {4, 5, 7}};
        System.out.println(Arrays.equals(deepArr1, deepArr2));
        System.out.println(Arrays.deepEquals(deepArr1, deepArr2));

        // Arrays.sort(arr) : 배열의 정렬
        int[] sortArr = {43, 6, 7, 8, 4, 34, 2};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}
