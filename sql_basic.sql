-- 問1
-- 全選手の以下のデータを抽出してください。
-- ・背番号（uniform_num）
-- ・名前（name）
-- ・所属クラブ（club）
SELECT uniform_num, name, club FROM players;

-- 問2
-- グループCに所属する国をすべて抽出してください。
SELECT * FROM countries WHERE group_name = 'C';

-- 問3
-- グループC以外に所属する国をすべて抽出してください。
SELECT * FROM countries WHERE group_name != 'C';

-- 問4
-- 現時点で40歳以上の選手を抽出してください。（誕生日の人を含めてください。）
-- 検索タイミングによって実行結果が異なります。
SELECT * FROM players WHERE birth <= CURRENT_DATE - interval '40 years';

-- 問5
-- 身長が170cm未満の選手を抽出してください。
SELECT * FROM players WHERE height < 170;

-- 問6
-- FIFAランクが日本（46位）の前後10位に該当する国（36位～56位）を抽出してください。ただし、BETWEEN句を用いてください。
SELECT * FROM countries WHERE ranking BETWEEN 36 AND 56;

-- 問7
-- 選手のポジションがGK、DF、MFに該当する選手をすべて抽出してください。ただし、IN句を用いてください。
SELECT * FROM players WHERE position IN ('GK', 'DF', 'MF');

-- 問8
-- オウンゴールとなったゴールを抽出してください。goalsテーブルのplayer_idカラムにNULLが格納されているデータがオウンゴールを表しています。
SELECT * FROM goals WHERE player_id IS NULL;

-- 問9
-- オウンゴール以外のゴールを抽出してください。goalsテーブルのplayer_idカラムにNULLが格納されているデータがオウンゴールを表しています。
SELECT * FROM goals WHERE player_id IS NOT NULL;

-- 問10
-- 名前の末尾が「ニョ」で終わるプレイヤーを抽出してください。
SELECT * FROM players WHERE name LIKE '%ニョ';

-- 問11
-- 名前の中に「ニョ」が含まれるプレイヤーを抽出してください。
SELECT * FROM players WHERE name LIKE '%ニョ%';

-- 問12
-- 全選手の中から小柄な選手（身長が165cm未満か、体重が60kg未満）を抽出してください。
SELECT * FROM players WHERE height < 165 OR weight < 60;

-- 問13
-- FWかMFの中で170未満の選手を抽出してください。ただし、ORとANDを使用してください。
SELECT * FROM players WHERE (position = 'FW' OR position = 'MF') AND (height < 170);

-- 問14
-- ポジションの一覧を重複なしで表示してください。グループ化は使用しないでください。
SELECT DISTINCT position FROM players;

-- 問15
-- 全選手の身長と体重を足した値をカラム名「体力指数」として表示してください。合わせて選手の名前、選手の所属クラブも表示してください。
SELECT name, club, (height + weight) AS 体力指数 FROM players;

-- 問16
-- 全ての選手を身長の大きい順に表示してください。同じ身長の選手は体重の重い順に表示してください。
SELECT * FROM players ORDER BY height DESC, weight DESC;

-- 問17
-- 全てのゴール情報を出力してください。ただし、オウンゴール（player_idがNULLのデータ）はCASE関数を使用してplayer_idを「9999」と表示してください。
SELECT 
	CASE
		WHEN player_id IS NULL THEN 9999
		ELSE player_id
	END AS player_id, goal_time
FROM goals;

-- 問18
-- 全ての選手の平均身長、平均体重を表示してください。
SELECT
	ROUND(AVG(height), 4) AS 平均身長,
	ROUND(AVG(weight), 4) AS 平均体重
FROM players;

-- 問19
-- 日本の選手（player_idが714から736）が上げたゴール数を表示してください。
SELECT COUNT(*) AS 日本のゴール数 FROM goals WHERE player_id BETWEEN 714 AND 736;

-- 問20
-- 全ての選手の中で最も高い身長と、最も軽い体重を表示してください。
SELECT 
	MAX(height) AS 最大身長,
	MIN(weight) AS 最大体重
FROM players;

-- 問21
-- CグループのFIFAランクの合計値を表示してください。
SELECT SUM(ranking) AS CグループのFIFAランクの合計値 
FROM countries 
WHERE group_name = 'C';

-- 問22
-- 全ての試合の国名と選手名、得点時間を表示してください。オウンゴール（player_idがNULL）は表示しないでください。
SELECT c.name, p.name, g.goal_time 
FROM countries c 
INNER JOIN players p ON c.id = p.country_id 
INNER JOIN goals g ON p.id = g.player_id 
WHERE g.player_id IS NOT NULL;

-- 問23
-- 全ての試合のゴール時間と選手名を表示してください。左側外部結合を使用してオウンゴール（player_idがNULL）も表示してください。
SELECT g.goal_time, p.uniform_num, p.position, p.name 
FROM goals g
LEFT JOIN players p ON p.id = g.player_id;

-- 問24
-- 全ての試合のゴール時間と選手名を表示してください。右側外部結合を使用してオウンゴール（player_idがNULL）も表示してください。
SELECT g.goal_time, p.uniform_num, p.position, p.name
FROM players p
RIGHT JOIN goals g ON p.id = g.player_id;

-- 問25
-- 全ての試合のゴール時間と選手名、国名を表示してください。また、オウンゴール（player_idがNULL）も表示してください。
SELECT c.name AS country_name, g.goal_time, p.position, p.name AS player_name
FROM goals g
LEFT JOIN players p ON p.id = g.player_id
LEFT JOIN countries c ON p.country_id = c.id;

-- 問26
-- 全てのゴール時間と得点を上げたプレイヤー名を表示してください。オウンゴールは表示しないでください。ただし、結合は使わずに副問合せを用いてください。
SELECT g.id, g.goal_time,
	(
		SELECT p.name
		FROM players p
		WHERE p.id = g.player_id
	)
FROM goals g
WHERE g.player_id IS NOT NULL;

-- 問27
-- 各ポジションごと（GK、FWなど）に最も身長と、その選手名、所属クラブを表示してください。ただし、FROM句に副問合せを使用してください。
 SELECT sub.position, sub.height, sub.name, sub.club
 FROM 
    (
        SELECT p1.position, p1.height, p1.name, p1.club
        FROM players p1
        WHERE p1.height = 
            (
                SELECT MAX(p2.height)
                FROM players p2
                WHERE p2.position = p1.position
            )
    ) AS sub

-- 問28
-- 各グループの最上位と最下位を表示し、その差が50より大きいグループを抽出してください。
SELECT c.group_name AS group_name, MAX(c.ranking), MIN(c.ranking)
FROM countries c
GROUP BY c.group_name
HAVING MAX(c.ranking) - MIN(c.ranking) > 50;

-- 問29
-- 1980年生まれと、1981年生まれの選手が何人いるか調べてください。ただし、日付関数は使用せず、UNION句を使用してください。
SELECT 1980 AS 誕生年, COUNT(*)
FROM players
WHERE birth BETWEEN '1980-01-01' AND '1980-12-31'
UNION
SELECT 1981 AS 誕生年, COUNT(*)
FROM players
WHERE birth BETWEEN '1981-01-01' AND '1981-12-31'

-- 問30
-- 身長が195㎝より大きいか、体重が95kgより大きい選手を抽出してください。
-- ただし、以下の画像のように、どちらの条件にも合致する場合には2件分のデータとして抽出してください。また、結果はidの昇順としてください。
SELECT id, position, name, height, weight
FROM players
WHERE height > 195
UNION ALL
SELECT id, position, name, height, weight
FROM players
WHERE weight > 95

ORDER BY id;

-- 問31
-- 身長の高い選手6位～20位を抽出し、以下の項目を表示してください。
-- ※身長が同じ選手がいる場合、同じ身長の中でも名前の順番(昇順)に並び替えてください。
-- ・名前
-- ・身長
-- ・体重
SELECT name, height, weight
FROM players
ORDER BY height DESC, name ASC
LIMIT 15 OFFSET 5;

-- 問32
-- グループCの各対戦毎にゴール数を表示してください。
-- ゴール数がゼロの場合も表示してください。副問合せは使わずに、外部結合だけを使用して下さい。
-- 表示するカラム
-- ・キックオフ日時
-- ・自国名
-- ・対戦相手国名
-- ・自国FIFAランク
-- ・対戦相手国FIFAランク
-- ・自国のゴール数
-- ソート順
-- ・キックオフ日時
-- ・自国FIFAランク
SELECT 
	p.kickoff,
	c1.name AS my_country,
	c2.name AS enemy_country,
	c1.ranking AS my_ranking,
	c2.ranking AS enemy_ranking,
COUNT(g.id) AS my_goals
FROM pairings p
LEFT JOIN countries c1 ON p.my_country_id = c1.id
LEFT JOIN countries c2 ON p.enemy_country_id = c2.id
LEFT JOIN goals g ON p.id = g.pairing_id
WHERE c1.group_name = 'C'
GROUP BY 
	p.kickoff,
	c1.name,
	c2.name,
	c1.ranking,
	c2.ranking
ORDER BY p.kickoff ASC, c1.ranking ASC;

-- 問33
-- グループCの各対戦毎にゴール数を表示してください。
-- ゴール数がゼロの場合も表示してください。自国のゴール数は副問合せを用いて表示してください。
-- 表示するカラム
-- ・キックオフ日時
-- ・自国名
-- ・対戦相手国名
-- ・自国FIFAランク
-- ・対戦相手国FIFAランク
-- ・自国のゴール数
-- ソート順
-- ・キックオフ日時
-- ・自国FIFAランク
SELECT
  p.kickoff,
  c1.name AS my_country,
  c2.name AS enemy_country,
  c1.ranking AS my_ranking,
  c2.ranking AS enemy_ranking,
  (
    SELECT COUNT(*)
    FROM goals g
    WHERE g.pairing_id = p.id
  ) AS my_goals
FROM pairings p
LEFT JOIN countries c1 ON p.my_country_id = c1.id
LEFT JOIN countries c2 ON p.enemy_country_id = c2.id
WHERE c1.group_name = 'C'
ORDER BY
  p.kickoff ASC,
  c1.ranking ASC;