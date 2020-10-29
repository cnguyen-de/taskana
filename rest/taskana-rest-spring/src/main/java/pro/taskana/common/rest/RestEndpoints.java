package pro.taskana.common.rest;

/** Collection of Url to Controller mappings. */
public final class RestEndpoints {

  public static final String API_V1 = "/api/v1/";

  public static final String URL_VERSION = API_V1 + "version";
  public static final String URL_DOMAIN = API_V1 + "domains";
  public static final String URL_CURRENT_USER = API_V1 + "current-user-info";
  public static final String URL_ACCESSID = API_V1 + "access-ids";
  public static final String URL_ACCESSID_GROUPS = API_V1 + "access-ids/groups";

  public static final String URL_CLASSIFICATIONS = API_V1 + "classifications";
  public static final String URL_CLASSIFICATIONS_ID = API_V1 + "classifications/{classificationId}";
  public static final String URL_CLASSIFICATION_DEFINITIONS = API_V1 + "classification-definitions";
  public static final String URL_CLASSIFICATION_CATEGORIES = API_V1 + "classification-categories";
  public static final String URL_CLASSIFICATION_TYPES = API_V1 + "classification-types";
  public static final String URL_CLASSIFICATION_CATEGORIES_BY_TYPES =
      API_V1 + "classifications-by-type";

  public static final String URL_WORKBASKET_ACCESS_ITEMS = API_V1 + "workbasket-access-items";
  public static final String URL_WORKBASKET = API_V1 + "workbaskets";
  public static final String URL_WORKBASKET_DEFINITIONS = API_V1 + "workbasket-definitions";
  public static final String URL_WORKBASKET_ID = API_V1 + "workbaskets/{workbasketId}";
  public static final String URL_WORKBASKET_ID_ACCESSITEMS =
      API_V1 + "workbaskets/{workbasketId}/workbasketAccessItems";
  public static final String URL_WORKBASKET_ID_DISTRIBUTION =
      API_V1 + "workbaskets/{workbasketId}/distribution-targets";

  public static final String URL_TASKS = API_V1 + "tasks";
  public static final String URL_TASK_COMMENT = API_V1 + "tasks/comments/{taskCommentId}";
  public static final String URL_TASKS_ID_SELECT_AND_CLAIM = API_V1 + "tasks/select-and-claim";
  public static final String URL_TASKS_ID = API_V1 + "tasks/{taskId}";
  public static final String URL_TASK_COMMENTS = API_V1 + "tasks/{taskId}/comments";
  public static final String URL_TASKS_ID_CLAIM = API_V1 + "tasks/{taskId}/claim";
  public static final String URL_TASKS_ID_COMPLETE = API_V1 + "tasks/{taskId}/complete";
  public static final String URL_TASKS_ID_TRANSFER_WORKBASKETID =
      API_V1 + "tasks/{taskId}/transfer/{workbasketId}";

  public static final String URL_MONITOR = API_V1 + "monitor";
  public static final String URL_MONITOR_TASKS_STATUS = API_V1 + "monitor/tasks-status-report";
  public static final String URL_MONITOR_TASKS_WORKBASKET =
      API_V1 + "monitor/tasks-workbasket-report";
  public static final String URL_MONITOR_TASKS_WORKBASKET_PLANNED =
      API_V1 + "monitor/tasks-workbasket-planned-date-report";
  public static final String URL_MONITOR_TASKS_CLASSIFICATION =
      API_V1 + "monitor/tasks-classification-report";
  public static final String URL_MONITOR_TIMESTAMP = API_V1 + "monitor/timestamp-report";

  public static final String URL_HISTORY_ENABLED = API_V1 + "history-provider-enabled";
  public static final String URL_HISTORY_EVENTS = API_V1 + "task-history-event";
  public static final String URL_HISTORY_EVENTS_ID = "/{historyEventId}";

  private RestEndpoints() {}
}
