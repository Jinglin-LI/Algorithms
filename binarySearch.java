// http://blog.csdn.net/shichaosong/article/details/8861246
// right = n - 1 => while (left <= right) => right = middle - 1
// right = n => while (left < right) => right = middle

public int binarySearch(int nums[], int target) {
	int low = 0, high = nums.length - 1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		if (nums[mid] == target) {
			return mid;
		}
		if (nums[mid] > target) {
			high = mid - 1;
		}
		else {
			low = mid + 1;
		}
	}
	return -1;
}

public int binarySearch(int[] nums, int low, int high, int target) {
	if (low <= high) {
		int mid = low + (high - low) / 2;
		if (nums[mid] == target) {
			return mid;
		}
		if (nums[mid] > target) {
			return binarySearch(nums, low, mid - 1, target);
		}
		else {
			return binarySearch(nums, mid + 1, high, target);
		}
	}
	return -1;
}

public int searchInsertPosition(int[] nums, int target) {
	int low = 0, high = nums.length;
	while (low < high) {
		int mid = low + (high - low) / 2;
		if (nums[mid] < target) {
			low = mid + 1;
		}
		else {
			high = mid;
		}
	}
	return low;
}
